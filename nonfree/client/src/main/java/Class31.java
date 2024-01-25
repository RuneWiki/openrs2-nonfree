import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public abstract class Class31 implements Interface11 {

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	private int anInt9887;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private int anInt9899;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private int anInt9893 = 0;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	private int anInt9897 = -1;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!jc;")
	protected final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_11;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private final int anInt9898;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
	private final boolean aBoolean838;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!jc;IZ)V")
	protected Class31(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass65_Sub2_Sub2_11 = arg0;
		this.anInt9898 = arg1;
		this.aBoolean838 = arg2;
	}

	@OriginalMember(owner = "client!du", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8235();
		super.finalize();
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	@Override
	public int method8232() {
		return this.anInt9887;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method8233(@OriginalArg(0) MapBuffer arg0) {
		@Pc(11) boolean local11 = true;
		if (this.anInt9893 != 0) {
			if (this.anInt9897 > 0) {
				OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
				if (this.anInt9893 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9898, 0, this.anInt9899, this.aClass65_Sub2_Sub2_11.aNativeHeapBuffer6.getAddress());
				} else {
					local11 = arg0.a();
				}
			}
			this.anInt9893 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method8235() {
		if (this.anInt9897 > 0) {
			this.aClass65_Sub2_Sub2_11.method4490(this.anInt9887, this.anInt9897);
			this.anInt9897 = -1;
		}
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)J")
	public final long method8236() {
		return this.anInt9897 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(I)V")
	private void method8238() {
		if (this.anInt9897 >= 0) {
			return;
		}
		if (this.aClass65_Sub2_Sub2_11.aBoolean454) {
			OpenGL.glGenBuffersARB(1, Static355.anIntArray370, 0);
			this.anInt9897 = Static355.anIntArray370[0];
			OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
		} else {
			this.anInt9897 = 0;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
	public void method8239(@OriginalArg(0) int arg0) {
		if (this.anInt9899 < arg0) {
			this.method8238();
			if (this.anInt9897 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass65_Sub2_Sub2_11.method4481(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
				OpenGL.glBufferDataARBub(this.anInt9898, arg0, (byte[]) null, 0, this.aBoolean838 ? 35040 : 35044);
				this.aClass65_Sub2_Sub2_11.anInt5231 += arg0 - this.anInt9899;
			}
			this.anInt9899 = arg0;
		}
		this.anInt9887 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	public final void method8240() {
		if (this.aClass65_Sub2_Sub2_11.aBoolean454) {
			OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZILclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8241(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt9893 == 0) {
			this.method8238();
			if (this.anInt9897 <= 0) {
				this.anInt9893 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
			OpenGL.glBufferDataARBub(this.anInt9898, this.anInt9899, (byte[]) null, 0, this.aBoolean838 ? 35040 : 35044);
			if (this.aClass65_Sub2_Sub2_11.aNativeHeapBuffer6.c >= this.anInt9887) {
				this.anInt9893 = 1;
				return this.aClass65_Sub2_Sub2_11.aNativeHeapBuffer6;
			}
			if (!arg0.b() && arg0.a(this.anInt9898, this.anInt9887, 35001)) {
				this.anInt9893 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method8242(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9899 >= arg1) {
			if (this.anInt9897 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
			OpenGL.glBufferSubDataARBa(this.anInt9898, 0, this.anInt9887, arg0.getAddress());
			this.aClass65_Sub2_Sub2_11.anInt5231 += arg1 - this.anInt9887;
		} else {
			this.method8238();
			if (this.anInt9897 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9898, this.anInt9897);
			OpenGL.glBufferDataARBa(this.anInt9898, arg1, arg0.getAddress(), this.aBoolean838 ? 35040 : 35044);
			this.aClass65_Sub2_Sub2_11.anInt5231 += arg1 - this.anInt9887;
			this.anInt9899 = arg1;
		}
		this.anInt9887 = arg1;
		return true;
	}
}
