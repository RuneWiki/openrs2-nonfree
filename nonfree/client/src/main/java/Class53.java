import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class53 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!fr;")
	private final Class91 aClass91_19 = new Class91(16);

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!qs;")
	private final Class211 aClass211_21;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class53(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_21 = arg2;
		this.aClass211_21.method4772(29);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public void method1333() {
		@Pc(7) Class91 local7 = this.aClass91_19;
		synchronized (this.aClass91_19) {
			this.aClass91_19.method1998(5);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method1334() {
		@Pc(2) Class91 local2 = this.aClass91_19;
		synchronized (this.aClass91_19) {
			this.aClass91_19.method1999();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method1338() {
		@Pc(6) Class91 local6 = this.aClass91_19;
		synchronized (this.aClass91_19) {
			this.aClass91_19.method1993();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ce;IIII)Lclient!op;")
	public Class189 method1339(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class267[] local13 = null;
		@Pc(18) Class243 local18 = this.method1341(arg0);
		if (local18.anIntArray678 != null) {
			local13 = new Class267[local18.anIntArray678.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(37) Class88 local37 = arg1.method896(local18.anIntArray678[local28]);
				local13[local28] = new Class267(local37.anInt2650, local37.anInt2641, local37.anInt2640, local37.anInt2643, local37.anInt2651, local37.anInt2645, local37.anInt2644, local37.aBoolean170);
			}
		}
		return new Class189(local18.anInt7121, local13, local18.anInt7124, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!tp;")
	private Class243 method1341(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_19;
		@Pc(16) Class243 local16;
		synchronized (this.aClass91_19) {
			local16 = (Class243) this.aClass91_19.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_21;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_21) {
			local38 = this.aClass211_21.method4758(arg0, 29);
		}
		local16 = new Class243();
		if (local38 != null) {
			local16.method5437(new Class1_Sub3(local38));
		}
		@Pc(68) Class91 local68 = this.aClass91_19;
		synchronized (this.aClass91_19) {
			this.aClass91_19.method1990(local16, (long) arg0);
			return local16;
		}
	}
}
