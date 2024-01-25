import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public abstract class Class58 implements Interface11 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	private int anInt8108;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
	private int anInt8118;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	private int anInt8115 = -1;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	private int anInt8119 = 0;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Z")
	private final boolean aBoolean579;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	private final int anInt8113;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "Lclient!qi;")
	protected final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_10;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!qi;IZ)V")
	protected Class58(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean579 = arg2;
		this.anInt8113 = arg1;
		this.aClass12_Sub2_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method6745(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt8119 != 0) {
			if (this.anInt8115 > 0) {
				OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
				if (this.anInt8119 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8113, 0, this.anInt8118, this.aClass12_Sub2_Sub2_10.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt8119 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	@Override
	public int method7647() {
		return this.anInt8108;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BI)Z")
	protected final boolean method6746(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= this.anInt8118) {
			if (this.anInt8115 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
			OpenGL.glBufferSubDataARBa(this.anInt8113, 0, this.anInt8108, arg0.getAddress());
			this.aClass12_Sub2_Sub2_10.anInt7515 += arg1 - this.anInt8108;
		} else {
			this.method6750();
			if (this.anInt8115 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
			OpenGL.glBufferDataARBa(this.anInt8113, arg1, arg0.getAddress(), this.aBoolean579 ? 35040 : 35044);
			this.aClass12_Sub2_Sub2_10.anInt7515 += arg1 - this.anInt8108;
			this.anInt8118 = arg1;
		}
		this.anInt8108 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public final void method6747() {
		if (this.aClass12_Sub2_Sub2_10.aBoolean556) {
			OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	public void method7651() {
		if (this.anInt8115 > 0) {
			this.aClass12_Sub2_Sub2_10.method6295(this.anInt8115, this.anInt8108);
			this.anInt8115 = -1;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
	private void method6750() {
		if (this.anInt8115 >= 0) {
			return;
		}
		if (this.aClass12_Sub2_Sub2_10.aBoolean556) {
			OpenGL.glGenBuffersARB(1, Static40.anIntArray422, 0);
			this.anInt8115 = Static40.anIntArray422[0];
			OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
		} else {
			this.anInt8115 = 0;
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)J")
	public final long method6751() {
		return this.anInt8115 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZI)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6752(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt8119 == 0) {
			this.method6750();
			if (this.anInt8115 <= 0) {
				this.anInt8119 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
			OpenGL.glBufferDataARBub(this.anInt8113, this.anInt8118, null, 0, this.aBoolean579 ? 35040 : 35044);
			if (this.aClass12_Sub2_Sub2_10.aNativeHeapBuffer7.b >= this.anInt8108) {
				this.anInt8119 = 1;
				return this.aClass12_Sub2_Sub2_10.aNativeHeapBuffer7;
			}
			if (!arg0.a() && arg0.a(this.anInt8113, this.anInt8108, 35001)) {
				this.anInt8119 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7651();
		super.finalize();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public void method7650(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt8118) {
			this.method6750();
			if (this.anInt8115 > 0) {
				OpenGL.glBindBufferARB(this.anInt8113, this.anInt8115);
				OpenGL.glBufferDataARBub(this.anInt8113, arg0, null, 0, this.aBoolean579 ? 35040 : 35044);
				this.aClass12_Sub2_Sub2_10.anInt7515 += arg0 - this.anInt8118;
			} else {
				this.aNativeHeapBuffer8 = this.aClass12_Sub2_Sub2_10.method6177(false, arg0);
			}
			this.anInt8118 = arg0;
		}
		this.anInt8108 = arg0;
	}
}
