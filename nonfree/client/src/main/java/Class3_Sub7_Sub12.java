import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public final int anInt3509;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_21;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3509 = arg1 * arg2;
		this.aClass45_Sub3_21 = arg0;
		this.aLong100 = this.aClass45_Sub3_21.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!gr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3144();
		super.finalize();
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)J")
	public long method3142() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
	private void method3144() {
		if ((long) 0 < this.aLong100) {
			this.aClass45_Sub3_21.anOpenGL2.releasePbuffer(this.aLong100);
			this.aLong100 = 0L;
		}
	}
}
