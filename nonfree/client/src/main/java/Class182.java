import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class182 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!ku;")
	private final Class139 aClass139_54 = new Class139(16);

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!b;")
	private final Class20 aClass20_59;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class182(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_59 = arg2;
		this.aClass20_59.method231(29);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILclient!tb;I)Lclient!he;")
	public Class101 method4248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class218 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class85[] local12 = null;
		@Pc(17) Class84 local17 = this.method4254(arg2);
		if (local17.anIntArray205 != null) {
			local12 = new Class85[local17.anIntArray205.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class114 local37 = arg3.method5010(local17.anIntArray205[local27]);
				local12[local27] = new Class85(local37.anInt2783, local37.anInt2786, local37.anInt2781, local37.anInt2782, local37.anInt2780, local37.anInt2784, local37.anInt2779, local37.aBoolean212);
			}
		}
		return new Class101(local17.anInt2072, local12, local17.anInt2070, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method4249() {
		@Pc(12) Class139 local12 = this.aClass139_54;
		synchronized (this.aClass139_54) {
			this.aClass139_54.method3072();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public void method4252() {
		@Pc(2) Class139 local2 = this.aClass139_54;
		synchronized (this.aClass139_54) {
			this.aClass139_54.method3083(5);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method4253() {
		@Pc(6) Class139 local6 = this.aClass139_54;
		synchronized (this.aClass139_54) {
			this.aClass139_54.method3075();
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Lclient!fm;")
	private Class84 method4254(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_54;
		@Pc(16) Class84 local16;
		synchronized (this.aClass139_54) {
			local16 = (Class84) this.aClass139_54.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_59.method253(arg0, 29);
		local16 = new Class84();
		if (local33 != null) {
			local16.method1727(new Class3_Sub5(local33));
		}
		@Pc(51) Class139 local51 = this.aClass139_54;
		synchronized (this.aClass139_54) {
			this.aClass139_54.method3070(local16, (long) arg0);
			return local16;
		}
	}
}
