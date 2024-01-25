import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public abstract class Class84 implements Interface2 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	private int anInt9925;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	private int anInt9929;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	private int anInt9927 = 0;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	private int anInt9934 = -1;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "Z")
	private final boolean aBoolean783;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!hl;")
	protected final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_10;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	private final int anInt9922;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!hl;IZ)V")
	protected Class84(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean783 = arg2;
		this.aClass5_Sub2_Sub2_10 = arg0;
		this.anInt9922 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;I)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8095(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt9927 == 0) {
			this.method8105();
			if (this.anInt9934 <= 0) {
				this.anInt9927 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
			OpenGL.glBufferDataARBub(this.anInt9922, this.anInt9925, (byte[]) null, 0, this.aBoolean783 ? 35040 : 35044);
			if (this.anInt9929 <= this.aClass5_Sub2_Sub2_10.aNativeHeapBuffer4.c) {
				this.anInt9927 = 1;
				return this.aClass5_Sub2_Sub2_10.aNativeHeapBuffer4;
			}
			if (!arg0.a() && arg0.a(this.anInt9922, this.anInt9929, 35001)) {
				this.anInt9927 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)J")
	public final long method8096() {
		return this.anInt9934 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method8098(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt9925) {
			this.method8105();
			if (this.anInt9934 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
			OpenGL.glBufferDataARBa(this.anInt9922, arg1, arg0.getAddress(), this.aBoolean783 ? 35040 : 35044);
			this.aClass5_Sub2_Sub2_10.anInt4852 += arg1 - this.anInt9929;
			this.anInt9925 = arg1;
		} else if (this.anInt9934 > 0) {
			OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
			OpenGL.glBufferSubDataARBa(this.anInt9922, 0, this.anInt9929, arg0.getAddress());
			this.aClass5_Sub2_Sub2_10.anInt4852 += arg1 - this.anInt9929;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9929 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public final void method8099() {
		if (this.aClass5_Sub2_Sub2_10.aBoolean404) {
			OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
		}
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8104();
		super.finalize();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public void method8101(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt9925) {
			this.method8105();
			if (this.anInt9934 > 0) {
				OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
				OpenGL.glBufferDataARBub(this.anInt9922, arg0, (byte[]) null, 0, this.aBoolean783 ? 35040 : 35044);
				this.aClass5_Sub2_Sub2_10.anInt4852 += arg0 - this.anInt9925;
			} else {
				this.aNativeHeapBuffer8 = this.aClass5_Sub2_Sub2_10.method3950(arg0, false);
			}
			this.anInt9925 = arg0;
		}
		this.anInt9929 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public void method8104() {
		if (this.anInt9934 > 0) {
			this.aClass5_Sub2_Sub2_10.method4074(this.anInt9929, this.anInt9934);
			this.anInt9934 = -1;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
	@Override
	public int method8094() {
		return this.anInt9929;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	private void method8105() {
		if (this.anInt9934 >= 0) {
			return;
		}
		if (this.aClass5_Sub2_Sub2_10.aBoolean404) {
			OpenGL.glGenBuffersARB(1, Static353.anIntArray324, 0);
			this.anInt9934 = Static353.anIntArray324[0];
			OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
		} else {
			this.anInt9934 = 0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;)Z")
	protected final boolean method8106(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt9927 != 0) {
			if (this.anInt9934 > 0) {
				OpenGL.glBindBufferARB(this.anInt9922, this.anInt9934);
				if (this.anInt9927 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9922, 0, this.anInt9925, this.aClass5_Sub2_Sub2_10.aNativeHeapBuffer4.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt9927 = 0;
		}
		return local5;
	}
}
