import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class18 {

	@OriginalMember(owner = "client!an", name = "m", descriptor = "Lclient!vda;")
	private Class4_Sub5 aClass4_Sub5_2;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!vda;")
	private final Class4_Sub5 aClass4_Sub5_1 = new Class4_Sub5();

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class18() {
		this.aClass4_Sub5_1.aClass4_Sub5_61 = this.aClass4_Sub5_1;
		this.aClass4_Sub5_1.aClass4_Sub5_62 = this.aClass4_Sub5_1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lclient!vda;")
	public Class4_Sub5 method218() {
		@Pc(6) Class4_Sub5 local6 = this.aClass4_Sub5_2;
		if (local6 == this.aClass4_Sub5_1) {
			this.aClass4_Sub5_2 = null;
			return null;
		} else {
			this.aClass4_Sub5_2 = local6.aClass4_Sub5_62;
			return local6;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!vda;I)V")
	public void method219(@OriginalArg(0) Class4_Sub5 arg0) {
		if (arg0.aClass4_Sub5_61 != null) {
			arg0.method8015();
		}
		arg0.aClass4_Sub5_62 = this.aClass4_Sub5_1;
		arg0.aClass4_Sub5_61 = this.aClass4_Sub5_1.aClass4_Sub5_61;
		arg0.aClass4_Sub5_61.aClass4_Sub5_62 = arg0;
		arg0.aClass4_Sub5_62.aClass4_Sub5_61 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Lclient!vda;")
	public Class4_Sub5 method221() {
		@Pc(7) Class4_Sub5 local7 = this.aClass4_Sub5_1.aClass4_Sub5_62;
		if (local7 == this.aClass4_Sub5_1) {
			this.aClass4_Sub5_2 = null;
			return null;
		} else {
			this.aClass4_Sub5_2 = local7.aClass4_Sub5_62;
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!vda;)V")
	public void method222(@OriginalArg(1) Class4_Sub5 arg0) {
		if (arg0.aClass4_Sub5_61 != null) {
			arg0.method8015();
		}
		arg0.aClass4_Sub5_62 = this.aClass4_Sub5_1.aClass4_Sub5_62;
		arg0.aClass4_Sub5_61 = this.aClass4_Sub5_1;
		arg0.aClass4_Sub5_61.aClass4_Sub5_62 = arg0;
		arg0.aClass4_Sub5_62.aClass4_Sub5_61 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lclient!vda;")
	public Class4_Sub5 method223() {
		@Pc(7) Class4_Sub5 local7 = this.aClass4_Sub5_1.aClass4_Sub5_61;
		if (local7 == this.aClass4_Sub5_1) {
			return null;
		} else {
			local7.method8015();
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(B)I")
	public int method224() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class4_Sub5 local17 = this.aClass4_Sub5_1.aClass4_Sub5_62; local17 != this.aClass4_Sub5_1; local17 = local17.aClass4_Sub5_62) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Lclient!vda;")
	public Class4_Sub5 method226() {
		@Pc(7) Class4_Sub5 local7 = this.aClass4_Sub5_1.aClass4_Sub5_62;
		if (local7 == this.aClass4_Sub5_1) {
			return null;
		} else {
			local7.method8015();
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	public void method227() {
		while (true) {
			@Pc(7) Class4_Sub5 local7 = this.aClass4_Sub5_1.aClass4_Sub5_62;
			if (this.aClass4_Sub5_1 == local7) {
				this.aClass4_Sub5_2 = null;
				return;
			}
			local7.method8015();
		}
	}
}
