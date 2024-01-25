import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public abstract class Class129 implements Interface5 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	private int anInt4093;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	private int anInt4086 = 0;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
	private int anInt4095 = -1;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Lclient!lh;")
	private final Class62_Sub1_Sub2 aClass62_Sub1_Sub2_6;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	private final int anInt4085;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!lh;IZ)V")
	protected Class129(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean246 = arg2;
		this.aClass62_Sub1_Sub2_6 = arg0;
		this.anInt4085 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)J")
	public final long method3486() {
		return this.anInt4095 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	public Buffer method3487() {
		if (this.anInt4086 == 0) {
			this.method3494();
			if (this.anInt4095 <= 0) {
				this.anInt4086 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
			OpenGL.glBufferDataARBub(this.anInt4085, this.anInt4093, null, 0, this.aBoolean246 ? 35040 : 35044);
			if (this.aClass62_Sub1_Sub2_6.aNativeHeapBuffer8.c >= this.anInt4084) {
				this.anInt4086 = 1;
				return this.aClass62_Sub1_Sub2_6.aNativeHeapBuffer8;
			}
			@Pc(63) MapBuffer local63 = this.aClass62_Sub1_Sub2_6.aMapBuffer1;
			if (!local63.b() && local63.a(this.anInt4085, this.anInt4084, 35001)) {
				this.anInt4086 = 2;
				return local63;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public void method3488(@OriginalArg(1) int arg0) {
		if (this.anInt4093 < arg0) {
			this.method3494();
			if (this.anInt4095 > 0) {
				OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
				OpenGL.glBufferDataARBub(this.anInt4085, arg0, null, 0, this.aBoolean246 ? 35040 : 35044);
				this.aClass62_Sub1_Sub2_6.anInt5640 += arg0 - this.anInt4093;
			} else {
				this.aNativeHeapBuffer7 = this.aClass62_Sub1_Sub2_6.method4688(false, arg0);
			}
			this.anInt4093 = arg0;
		}
		this.anInt4084 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3493();
		super.finalize();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method3491(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (this.anInt4093 >= arg0) {
			if (this.anInt4095 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
			OpenGL.glBufferSubDataARBa(this.anInt4085, 0, this.anInt4084, arg1.getAddress());
			this.aClass62_Sub1_Sub2_6.anInt5640 += arg0 - this.anInt4084;
		} else {
			this.method3494();
			if (this.anInt4095 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
			OpenGL.glBufferDataARBa(this.anInt4085, arg0, arg1.getAddress(), this.aBoolean246 ? 35040 : 35044);
			this.aClass62_Sub1_Sub2_6.anInt5640 += arg0 - this.anInt4084;
			this.anInt4093 = arg0;
		}
		this.anInt4084 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z")
	public boolean method3492() {
		@Pc(10) boolean local10 = true;
		if (this.anInt4086 != 0) {
			if (this.anInt4095 > 0) {
				OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
				if (this.anInt4086 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt4085, 0, this.anInt4093, this.aClass62_Sub1_Sub2_6.aNativeHeapBuffer8.getAddress());
				} else {
					local10 = this.aClass62_Sub1_Sub2_6.aMapBuffer1.a();
				}
			}
			this.anInt4086 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method3493() {
		if (this.anInt4095 > 0) {
			this.aClass62_Sub1_Sub2_6.method4794(this.anInt4084, this.anInt4095);
			this.anInt4095 = -1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	@Override
	public int method3485() {
		return this.anInt4084;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	private void method3494() {
		if (this.anInt4095 >= 0) {
			return;
		}
		if (this.aClass62_Sub1_Sub2_6.aBoolean402) {
			OpenGL.glGenBuffersARB(1, Static139.anIntArray233, 0);
			this.anInt4095 = Static139.anIntArray233[0];
			OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
		} else {
			this.anInt4095 = 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public final void method3496() {
		if (this.aClass62_Sub1_Sub2_6.aBoolean402) {
			OpenGL.glBindBufferARB(this.anInt4085, this.anInt4095);
		}
	}
}
