import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public abstract class Class11 implements Interface1 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	private int anInt7420;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private int anInt7430;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	private int anInt7429 = -1;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	private int anInt7432 = 0;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	private final int anInt7425;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!mc;")
	private final Class90_Sub3_Sub1 aClass90_Sub3_Sub1_9;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!mc;IZ)V")
	protected Class11(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt7425 = arg1;
		this.aClass90_Sub3_Sub1_9 = arg0;
		this.aBoolean504 = arg2;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
	public boolean method6460() {
		@Pc(11) boolean local11 = true;
		if (this.anInt7432 != 0) {
			if (this.anInt7429 > 0) {
				OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
				if (this.anInt7432 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7425, 0, this.anInt7430, this.aClass90_Sub3_Sub1_9.aNativeHeapBuffer8.getAddress());
				} else {
					local11 = this.aClass90_Sub3_Sub1_9.aMapBuffer1.a();
				}
			}
			this.anInt7432 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILclient!jaclib/memory/Source;)Z")
	protected final boolean method5927(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (this.anInt7430 >= arg0) {
			if (this.anInt7429 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
			OpenGL.glBufferSubDataARBa(this.anInt7425, 0, this.anInt7420, arg1.getAddress());
			this.aClass90_Sub3_Sub1_9.anInt9533 += arg0 - this.anInt7420;
		} else {
			this.method5930();
			if (this.anInt7429 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
			OpenGL.glBufferDataARBa(this.anInt7425, arg0, arg1.getAddress(), this.aBoolean504 ? 35040 : 35044);
			this.aClass90_Sub3_Sub1_9.anInt9533 += arg0 - this.anInt7420;
			this.anInt7430 = arg0;
		}
		this.anInt7420 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public final void method5928() {
		if (this.aClass90_Sub3_Sub1_9.aBoolean432) {
			OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
	private void method5930() {
		if (this.anInt7429 >= 0) {
			return;
		}
		if (this.aClass90_Sub3_Sub1_9.aBoolean432) {
			OpenGL.glGenBuffersARB(1, Static65.anIntArray104, 0);
			this.anInt7429 = Static65.anIntArray104[0];
			OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
		} else {
			this.anInt7429 = 0;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)I")
	@Override
	public int method6458() {
		return this.anInt7420;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method6462() {
		if (this.anInt7432 == 0) {
			this.method5930();
			if (this.anInt7429 <= 0) {
				this.anInt7432 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
			OpenGL.glBufferDataARBub(this.anInt7425, this.anInt7430, null, 0, this.aBoolean504 ? 35040 : 35044);
			if (this.anInt7420 <= this.aClass90_Sub3_Sub1_9.aNativeHeapBuffer8.d) {
				this.anInt7432 = 1;
				return this.aClass90_Sub3_Sub1_9.aNativeHeapBuffer8;
			}
			@Pc(62) MapBuffer local62 = this.aClass90_Sub3_Sub1_9.aMapBuffer1;
			if (!local62.b() && local62.a(this.anInt7425, this.anInt7420, 35001)) {
				this.anInt7432 = 2;
				return local62;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)J")
	public final long method5932() {
		return this.anInt7429 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
	public void method6461() {
		if (this.anInt7429 > 0) {
			this.aClass90_Sub3_Sub1_9.method4888(this.anInt7420, this.anInt7429);
			this.anInt7429 = -1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	public void method5935(@OriginalArg(0) int arg0) {
		if (this.anInt7430 < arg0) {
			this.method5930();
			if (this.anInt7429 > 0) {
				OpenGL.glBindBufferARB(this.anInt7425, this.anInt7429);
				OpenGL.glBufferDataARBub(this.anInt7425, arg0, null, 0, this.aBoolean504 ? 35040 : 35044);
				this.aClass90_Sub3_Sub1_9.anInt9533 += arg0 - this.anInt7430;
			} else {
				this.aNativeHeapBuffer7 = this.aClass90_Sub3_Sub1_9.method7651(arg0, false);
			}
			this.anInt7430 = arg0;
		}
		this.anInt7420 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6461();
		super.finalize();
	}
}
