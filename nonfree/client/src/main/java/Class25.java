import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class25 implements Interface6 {

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private int anInt7845;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	private int anInt7854;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	private int anInt7847 = 0;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	private int anInt7855 = -1;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private final int anInt7839;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!ai;")
	protected final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_10;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private final boolean aBoolean566;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ai;IZ)V")
	protected Class25(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt7839 = arg1;
		this.aClass16_Sub1_Sub1_10 = arg0;
		this.aBoolean566 = arg2;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	private void method6494() {
		if (this.anInt7855 >= 0) {
			return;
		}
		if (this.aClass16_Sub1_Sub1_10.aBoolean71) {
			OpenGL.glGenBuffersARB(1, Static432.anIntArray439, 0);
			this.anInt7855 = Static432.anIntArray439[0];
			OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
		} else {
			this.anInt7855 = 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)I")
	@Override
	public int method6492() {
		return this.anInt7854;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method6495(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7847 != 0) {
			if (this.anInt7855 > 0) {
				OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
				if (this.anInt7847 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7839, 0, this.anInt7845, this.aClass16_Sub1_Sub1_10.aNativeHeapBuffer5.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt7847 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public void method6496() {
		if (this.anInt7855 > 0) {
			this.aClass16_Sub1_Sub1_10.method755(this.anInt7854, this.anInt7855);
			this.anInt7855 = -1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZB)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6497(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt7847 == 0) {
			this.method6494();
			if (this.anInt7855 <= 0) {
				this.anInt7847 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
			OpenGL.glBufferDataARBub(this.anInt7839, this.anInt7845, null, 0, this.aBoolean566 ? 35040 : 35044);
			if (this.aClass16_Sub1_Sub1_10.aNativeHeapBuffer5.a >= this.anInt7854) {
				this.anInt7847 = 1;
				return this.aClass16_Sub1_Sub1_10.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt7839, this.anInt7854, 35001)) {
				this.anInt7847 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method6499(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= this.anInt7845) {
			if (this.anInt7855 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
			OpenGL.glBufferSubDataARBa(this.anInt7839, 0, this.anInt7854, arg0.getAddress());
			this.aClass16_Sub1_Sub1_10.anInt4891 += arg1 - this.anInt7854;
		} else {
			this.method6494();
			if (this.anInt7855 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
			OpenGL.glBufferDataARBa(this.anInt7839, arg1, arg0.getAddress(), this.aBoolean566 ? 35040 : 35044);
			this.aClass16_Sub1_Sub1_10.anInt4891 += arg1 - this.anInt7854;
			this.anInt7845 = arg1;
		}
		this.anInt7854 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public void method6500(@OriginalArg(1) int arg0) {
		if (this.anInt7845 < arg0) {
			this.method6494();
			if (this.anInt7855 > 0) {
				OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
				OpenGL.glBufferDataARBub(this.anInt7839, arg0, null, 0, this.aBoolean566 ? 35040 : 35044);
				this.aClass16_Sub1_Sub1_10.anInt4891 += arg0 - this.anInt7845;
			} else {
				this.aNativeHeapBuffer8 = this.aClass16_Sub1_Sub1_10.method3996(arg0, false);
			}
			this.anInt7845 = arg0;
		}
		this.anInt7854 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)J")
	public final long method6502() {
		return this.anInt7855 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6496();
		super.finalize();
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	public final void method6503() {
		if (this.aClass16_Sub1_Sub1_10.aBoolean71) {
			OpenGL.glBindBufferARB(this.anInt7839, this.anInt7855);
		}
	}
}
