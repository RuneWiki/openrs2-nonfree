import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class123 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!au;")
	private final Class21 aClass21_26 = new Class21(16);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_33;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class123(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_33 = arg2;
		this.aClass229_33.method4981(29);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public void method2204() {
		@Pc(14) Class21 local14 = this.aClass21_26;
		synchronized (this.aClass21_26) {
			this.aClass21_26.method314();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIILclient!bo;)Lclient!wa;")
	public Class358 method2205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4) {
		@Pc(12) Class114[] local12 = null;
		@Pc(17) Class73 local17 = this.method2208(arg1);
		if (local17.anIntArray147 != null) {
			local12 = new Class114[local17.anIntArray147.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class31 local37 = arg4.method804(local17.anIntArray147[local27]);
				local12[local27] = new Class114(local37.anInt667, local37.anInt669, local37.anInt666, local37.anInt674, local37.anInt664, local37.anInt672, local37.anInt673, local37.aBoolean31);
			}
		}
		return new Class358(local17.anInt1634, local12, local17.anInt1635, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method2206() {
		@Pc(6) Class21 local6 = this.aClass21_26;
		synchronized (this.aClass21_26) {
			this.aClass21_26.method323(5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lclient!dfa;")
	private Class73 method2208(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_26;
		@Pc(16) Class73 local16;
		synchronized (this.aClass21_26) {
			local16 = (Class73) this.aClass21_26.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_33;
		@Pc(38) byte[] local38;
		synchronized (this.aClass229_33) {
			local38 = this.aClass229_33.method4980(29, arg0);
		}
		local16 = new Class73();
		if (local38 != null) {
			local16.method1373(new Class2_Sub7(local38));
		}
		@Pc(60) Class21 local60 = this.aClass21_26;
		synchronized (this.aClass21_26) {
			this.aClass21_26.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method2210() {
		@Pc(6) Class21 local6 = this.aClass21_26;
		synchronized (this.aClass21_26) {
			this.aClass21_26.method313();
		}
	}
}
