import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class172 implements Interface20 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	private int anInt6120;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt6124;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	private int anInt6119 = -1;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	private int anInt6123 = 0;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	private final int anInt6121;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!dda;")
	protected final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_8;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!dda;IZ)V")
	protected Class172(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean448 = arg2;
		this.anInt6121 = arg1;
		this.aClass44_Sub2_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public final void method5225() {
		if (this.aClass44_Sub2_Sub1_8.aBoolean148) {
			OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method5226(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt6120) {
			this.method5234();
			if (this.anInt6119 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
			OpenGL.glBufferDataARBa(this.anInt6121, arg0, arg1.getAddress(), this.aBoolean448 ? 35040 : 35044);
			this.aClass44_Sub2_Sub1_8.anInt4931 += arg0 - this.anInt6124;
			this.anInt6120 = arg0;
		} else if (this.anInt6119 > 0) {
			OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
			OpenGL.glBufferSubDataARBa(this.anInt6121, 0, this.anInt6124, arg1.getAddress());
			this.aClass44_Sub2_Sub1_8.anInt4931 += arg0 - this.anInt6124;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt6124 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public void method5228(@OriginalArg(0) int arg0) {
		if (this.anInt6120 < arg0) {
			this.method5234();
			if (this.anInt6119 <= 0) {
				this.aNativeHeapBuffer6 = this.aClass44_Sub2_Sub1_8.method4360(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
				OpenGL.glBufferDataARBub(this.anInt6121, arg0, null, 0, this.aBoolean448 ? 35040 : 35044);
				this.aClass44_Sub2_Sub1_8.anInt4931 += arg0 - this.anInt6120;
			}
			this.anInt6120 = arg0;
		}
		this.anInt6124 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5230();
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public void method5230() {
		if (this.anInt6119 > 0) {
			this.aClass44_Sub2_Sub1_8.method2016(this.anInt6119, this.anInt6124);
			this.anInt6119 = -1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5231(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt6123 == 0) {
			this.method5234();
			if (this.anInt6119 <= 0) {
				this.anInt6123 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
			OpenGL.glBufferDataARBub(this.anInt6121, this.anInt6120, null, 0, this.aBoolean448 ? 35040 : 35044);
			if (this.anInt6124 <= this.aClass44_Sub2_Sub1_8.aNativeHeapBuffer5.c) {
				this.anInt6123 = 1;
				return this.aClass44_Sub2_Sub1_8.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt6121, this.anInt6124, 35001)) {
				this.anInt6123 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)J")
	public final long method5232() {
		return this.anInt6119 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method5233(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt6123 != 0) {
			if (this.anInt6119 > 0) {
				OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
				if (this.anInt6123 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6121, 0, this.anInt6120, this.aClass44_Sub2_Sub1_8.aNativeHeapBuffer5.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt6123 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return this.anInt6124;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	private void method5234() {
		if (this.anInt6119 >= 0) {
			return;
		}
		if (this.aClass44_Sub2_Sub1_8.aBoolean148) {
			OpenGL.glGenBuffersARB(1, Static267.anIntArray256, 0);
			this.anInt6119 = Static267.anIntArray256[0];
			OpenGL.glBindBufferARB(this.anInt6121, this.anInt6119);
		} else {
			this.anInt6119 = 0;
		}
	}
}
