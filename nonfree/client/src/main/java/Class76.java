import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public abstract class Class76 implements Interface17 {

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	private int anInt4771 = 0;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
	private int anInt4774 = -1;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Lclient!el;")
	private final Class14_Sub2_Sub1 aClass14_Sub2_Sub1_6;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
	private final int anInt4776;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
	private final boolean aBoolean326;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!el;IZ)V")
	protected Class76(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass14_Sub2_Sub1_6 = arg0;
		this.anInt4776 = arg1;
		this.aBoolean326 = arg2;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	private void method4088() {
		if (this.anInt4774 >= 0) {
			return;
		}
		if (this.aClass14_Sub2_Sub1_6.aBoolean198) {
			OpenGL.glGenBuffersARB(1, Static250.anIntArray375, 0);
			this.anInt4774 = Static250.anIntArray375[0];
			OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
		} else {
			this.anInt4774 = 0;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method4089(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (this.anInt4773 < arg0) {
			this.method4088();
			if (this.anInt4774 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
			OpenGL.glBufferDataARBa(this.anInt4776, arg0, arg1.getAddress(), this.aBoolean326 ? 35040 : 35044);
			this.aClass14_Sub2_Sub1_6.anInt8573 += arg0 - this.anInt4770;
			this.anInt4773 = arg0;
		} else if (this.anInt4774 > 0) {
			OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
			OpenGL.glBufferSubDataARBa(this.anInt4776, 0, this.anInt4770, arg1.getAddress());
			this.aClass14_Sub2_Sub1_6.anInt8573 += arg0 - this.anInt4770;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt4770 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
	public final void method4090() {
		if (this.aClass14_Sub2_Sub1_6.aBoolean198) {
			OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
		}
	}

	@OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4091();
		super.finalize();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public void method4091() {
		if (this.anInt4774 > 0) {
			this.aClass14_Sub2_Sub1_6.method2475(this.anInt4770, this.anInt4774);
			this.anInt4774 = -1;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
	public void method4092(@OriginalArg(1) int arg0) {
		if (this.anInt4773 < arg0) {
			this.method4088();
			if (this.anInt4774 > 0) {
				OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
				OpenGL.glBufferDataARBub(this.anInt4776, arg0, null, 0, this.aBoolean326 ? 35040 : 35044);
				this.aClass14_Sub2_Sub1_6.anInt8573 += arg0 - this.anInt4773;
			} else {
				this.aNativeHeapBuffer6 = this.aClass14_Sub2_Sub1_6.method6936(false, arg0);
			}
			this.anInt4773 = arg0;
		}
		this.anInt4770 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)I")
	@Override
	public int method4087() {
		return this.anInt4770;
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)J")
	public final long method4093() {
		return this.anInt4774 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Z")
	public boolean method4094() {
		@Pc(11) boolean local11 = true;
		if (this.anInt4771 != 0) {
			if (this.anInt4774 > 0) {
				OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
				if (this.anInt4771 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt4776, 0, this.anInt4773, this.aClass14_Sub2_Sub1_6.aNativeHeapBuffer7.getAddress());
				} else {
					local11 = this.aClass14_Sub2_Sub1_6.aMapBuffer1.b();
				}
			}
			this.anInt4771 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method4095() {
		if (this.anInt4771 == 0) {
			this.method4088();
			if (this.anInt4774 <= 0) {
				this.anInt4771 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt4776, this.anInt4774);
			OpenGL.glBufferDataARBub(this.anInt4776, this.anInt4773, null, 0, this.aBoolean326 ? 35040 : 35044);
			if (this.anInt4770 <= this.aClass14_Sub2_Sub1_6.aNativeHeapBuffer7.d) {
				this.anInt4771 = 1;
				return this.aClass14_Sub2_Sub1_6.aNativeHeapBuffer7;
			}
			@Pc(60) MapBuffer local60 = this.aClass14_Sub2_Sub1_6.aMapBuffer1;
			if (!local60.a() && local60.a(this.anInt4776, this.anInt4770, 35001)) {
				this.anInt4771 = 2;
				return local60;
			}
		}
		return null;
	}
}
