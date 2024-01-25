import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class260 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!eda;")
	private final Class87 aClass87_173 = new Class87(16);

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Lclient!la;")
	private final Class207 aClass207_83;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class260(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_83 = arg2;
		this.aClass207_83.method4672(29);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public void method6301() {
		@Pc(6) Class87 local6 = this.aClass87_173;
		synchronized (this.aClass87_173) {
			this.aClass87_173.method1796();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public void method6302() {
		@Pc(2) Class87 local2 = this.aClass87_173;
		synchronized (this.aClass87_173) {
			this.aClass87_173.method1793(5);
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(II)Lclient!tea;")
	private Class329 method6303(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_173;
		@Pc(16) Class329 local16;
		synchronized (this.aClass87_173) {
			local16 = (Class329) this.aClass87_173.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_83) {
			local38 = this.aClass207_83.method4681(29, arg0);
		}
		local16 = new Class329();
		if (local38 != null) {
			local16.method7887(new Class5_Sub22(local38));
		}
		@Pc(62) Class87 local62 = this.aClass87_173;
		synchronized (this.aClass87_173) {
			this.aClass87_173.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
	public void method6304() {
		@Pc(6) Class87 local6 = this.aClass87_173;
		synchronized (this.aClass87_173) {
			this.aClass87_173.method1801();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!kca;IIII)Lclient!cs;")
	public Class64 method6305(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class270[] local7 = null;
		@Pc(19) Class329 local19 = this.method6303(arg3);
		if (local19.anIntArray502 != null) {
			local7 = new Class270[local19.anIntArray502.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(39) Class340 local39 = arg1.method4431(local19.anIntArray502[local29]);
				local7[local29] = new Class270(local39.anInt9324, local39.anInt9335, local39.anInt9325, local39.anInt9326, local39.anInt9330, local39.anInt9329, local39.anInt9331, local39.aBoolean672);
			}
		}
		return new Class64(local19.anInt9140, local7, local19.anInt9141, arg4, arg2, arg0);
	}
}
