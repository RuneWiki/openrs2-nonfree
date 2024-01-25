import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public abstract class Class65 implements Interface13 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
	private int anInt6150;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
	private int anInt6158 = 0;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	private int anInt6149 = -1;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	private final int anInt6153;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!ph;")
	private final Class122_Sub2_Sub2 aClass122_Sub2_Sub2_8;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ph;IZ)V")
	protected Class65(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt6153 = arg1;
		this.aClass122_Sub2_Sub2_8 = arg0;
		this.aBoolean439 = arg2;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
	@Override
	public int method5726() {
		return this.anInt6152;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
	private void method5200() {
		if (this.anInt6149 >= 0) {
			return;
		}
		if (this.aClass122_Sub2_Sub2_8.aBoolean493) {
			OpenGL.glGenBuffersARB(1, Static541.anIntArray843, 0);
			this.anInt6149 = Static541.anIntArray843[0];
			OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
		} else {
			this.anInt6149 = 0;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	public boolean method5730() {
		@Pc(10) boolean local10 = true;
		if (this.anInt6158 != 0) {
			if (this.anInt6149 > 0) {
				OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
				if (this.anInt6158 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6153, 0, this.anInt6150, this.aClass122_Sub2_Sub2_8.aNativeHeapBuffer8.getAddress());
				} else {
					local10 = this.aClass122_Sub2_Sub2_8.aMapBuffer1.a();
				}
			}
			this.anInt6158 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	public void method5227(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt6150) {
			this.method5200();
			if (this.anInt6149 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass122_Sub2_Sub2_8.method5594(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
				OpenGL.glBufferDataARBub(this.anInt6153, arg0, null, 0, this.aBoolean439 ? 35040 : 35044);
				this.aClass122_Sub2_Sub2_8.anInt6689 += arg0 - this.anInt6150;
			}
			this.anInt6150 = arg0;
		}
		this.anInt6152 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5728();
		super.finalize();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method5205(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (this.anInt6150 >= arg0) {
			if (this.anInt6149 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
			OpenGL.glBufferSubDataARBa(this.anInt6153, 0, this.anInt6152, arg1.getAddress());
			this.aClass122_Sub2_Sub2_8.anInt6689 += arg0 - this.anInt6152;
		} else {
			this.method5200();
			if (this.anInt6149 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
			OpenGL.glBufferDataARBa(this.anInt6153, arg0, arg1.getAddress(), this.aBoolean439 ? 35040 : 35044);
			this.aClass122_Sub2_Sub2_8.anInt6689 += arg0 - this.anInt6152;
			this.anInt6150 = arg0;
		}
		this.anInt6152 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)J")
	public final long method5206() {
		return this.anInt6149 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method5728() {
		if (this.anInt6149 > 0) {
			this.aClass122_Sub2_Sub2_8.method5686(this.anInt6149, this.anInt6152);
			this.anInt6149 = -1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method5729() {
		if (this.anInt6158 == 0) {
			this.method5200();
			if (this.anInt6149 <= 0) {
				this.anInt6158 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
			OpenGL.glBufferDataARBub(this.anInt6153, this.anInt6150, null, 0, this.aBoolean439 ? 35040 : 35044);
			if (this.anInt6152 <= this.aClass122_Sub2_Sub2_8.aNativeHeapBuffer8.b) {
				this.anInt6158 = 1;
				return this.aClass122_Sub2_Sub2_8.aNativeHeapBuffer8;
			}
			@Pc(57) MapBuffer local57 = this.aClass122_Sub2_Sub2_8.aMapBuffer1;
			if (!local57.b() && local57.a(this.anInt6153, this.anInt6152, 35001)) {
				this.anInt6158 = 2;
				return local57;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
	public final void method5210() {
		if (this.aClass122_Sub2_Sub2_8.aBoolean493) {
			OpenGL.glBindBufferARB(this.anInt6153, this.anInt6149);
		}
	}
}
