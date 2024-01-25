import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public abstract class Class21 implements Interface6 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	private int anInt8703;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
	private int anInt8704;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	private int anInt8694 = -1;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	private int anInt8706 = 0;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	private final int anInt8702;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
	private final boolean aBoolean655;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Lclient!tm;")
	private final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_9;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!tm;IZ)V")
	protected Class21(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt8702 = arg1;
		this.aBoolean655 = arg2;
		this.aClass4_Sub2_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
	private void method7606() {
		if (this.anInt8694 >= 0) {
			return;
		}
		if (this.aClass4_Sub2_Sub2_9.aBoolean617) {
			OpenGL.glGenBuffersARB(1, Static260.anIntArray417, 0);
			this.anInt8694 = Static260.anIntArray417[0];
			OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
		} else {
			this.anInt8694 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	public void method7607(@OriginalArg(1) int arg0) {
		if (this.anInt8703 < arg0) {
			this.method7606();
			if (this.anInt8694 > 0) {
				OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
				OpenGL.glBufferDataARBub(this.anInt8702, arg0, null, 0, this.aBoolean655 ? 35040 : 35044);
				this.aClass4_Sub2_Sub2_9.anInt8287 += arg0 - this.anInt8703;
			} else {
				this.aNativeHeapBuffer8 = this.aClass4_Sub2_Sub2_9.method7297(false, arg0);
			}
			this.anInt8703 = arg0;
		}
		this.anInt8704 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public final void method7608() {
		if (this.aClass4_Sub2_Sub2_9.aBoolean617) {
			OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public void method7609() {
		if (this.anInt8694 > 0) {
			this.aClass4_Sub2_Sub2_9.method7367(this.anInt8704, this.anInt8694);
			this.anInt8694 = -1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)J")
	public final long method7610() {
		return this.anInt8694 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt8704;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method7611(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8703 >= arg1) {
			if (this.anInt8694 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
			OpenGL.glBufferSubDataARBa(this.anInt8702, 0, this.anInt8704, arg0.getAddress());
			this.aClass4_Sub2_Sub2_9.anInt8287 += arg1 - this.anInt8704;
		} else {
			this.method7606();
			if (this.anInt8694 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
			OpenGL.glBufferDataARBa(this.anInt8702, arg1, arg0.getAddress(), this.aBoolean655 ? 35040 : 35044);
			this.aClass4_Sub2_Sub2_9.anInt8287 += arg1 - this.anInt8704;
			this.anInt8703 = arg1;
		}
		this.anInt8704 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method7613() {
		if (this.anInt8706 == 0) {
			this.method7606();
			if (this.anInt8694 <= 0) {
				this.anInt8706 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
			OpenGL.glBufferDataARBub(this.anInt8702, this.anInt8703, null, 0, this.aBoolean655 ? 35040 : 35044);
			if (this.aClass4_Sub2_Sub2_9.aNativeHeapBuffer6.d >= this.anInt8704) {
				this.anInt8706 = 1;
				return this.aClass4_Sub2_Sub2_9.aNativeHeapBuffer6;
			}
			@Pc(54) MapBuffer local54 = this.aClass4_Sub2_Sub2_9.aMapBuffer1;
			if (!local54.b() && local54.a(this.anInt8702, this.anInt8704, 35001)) {
				this.anInt8706 = 2;
				return local54;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)Z")
	public boolean method7614() {
		@Pc(5) boolean local5 = true;
		if (this.anInt8706 != 0) {
			if (this.anInt8694 > 0) {
				OpenGL.glBindBufferARB(this.anInt8702, this.anInt8694);
				if (this.anInt8706 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8702, 0, this.anInt8703, this.aClass4_Sub2_Sub2_9.aNativeHeapBuffer6.getAddress());
				} else {
					local5 = this.aClass4_Sub2_Sub2_9.aMapBuffer1.a();
				}
			}
			this.anInt8706 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7609();
		super.finalize();
	}
}
