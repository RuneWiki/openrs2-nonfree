import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class117 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Lclient!tm;")
	private Class6_Sub5 aClass6_Sub5_39 = new Class6_Sub5();

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!ns;")
	private final Class231 aClass231_4 = new Class231();

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	private final int anInt3975;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "Lclient!wr;")
	private final Class380 aClass380_12;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.anInt3977 = arg0;
		this.anInt3975 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass380_12 = new Class380(local19);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(JB)V")
	public void method3384(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub5 local10 = (Class6_Sub5) this.aClass380_12.method8747(arg0);
		if (local10 != null) {
			local10.method8792();
			local10.method7748();
			this.anInt3977++;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public void method3385() {
		this.aClass231_4.method6049();
		this.aClass380_12.method8751();
		this.aClass6_Sub5_39 = new Class6_Sub5();
		this.anInt3977 = this.anInt3975;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BJ)Lclient!tm;")
	public Class6_Sub5 method3389(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub5 local10 = (Class6_Sub5) this.aClass380_12.method8747(arg0);
		if (local10 != null) {
			this.aClass231_4.method6048(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!tm;J)V")
	public void method3390(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3977 == 0) {
			@Pc(10) Class6_Sub5 local10 = this.aClass231_4.method6052();
			local10.method8792();
			local10.method7748();
			if (this.aClass6_Sub5_39 == local10) {
				local10 = this.aClass231_4.method6052();
				local10.method8792();
				local10.method7748();
			}
		} else {
			this.anInt3977--;
		}
		this.aClass380_12.method8753(arg0, arg1);
		this.aClass231_4.method6048(arg0);
	}
}
