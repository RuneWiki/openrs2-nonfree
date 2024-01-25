import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class389 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!gq;")
	private final Class149 aClass149_11 = new Class149();

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	private final int anInt10744;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	private int anInt10740;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!qha;")
	private Class291 aClass291_44;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class389(@OriginalArg(0) int arg0) {
		this.anInt10744 = arg0;
		this.anInt10740 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass291_44 = new Class291(local16);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!pt;Ljava/lang/Object;)V")
	public void method9246(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) Object arg1) {
		this.method9251(arg1, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method9249() {
		for (@Pc(12) Class5_Sub5_Sub5 local12 = (Class5_Sub5_Sub5) this.aClass149_11.method2890(); local12 != null; local12 = (Class5_Sub5_Sub5) this.aClass149_11.method2894()) {
			if (local12.method8986()) {
				local12.method9327(1);
				local12.method9186();
				this.anInt10740 += local12.anInt10470;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!pt;)Ljava/lang/Object;")
	public Object method9250(@OriginalArg(1) Interface20 arg0) {
		@Pc(11) long local11 = arg0.method4044();
		for (@Pc(26) Class5_Sub5_Sub5 local26 = (Class5_Sub5_Sub5) this.aClass291_44.method6993(local11, 1); local26 != null; local26 = (Class5_Sub5_Sub5) this.aClass291_44.method6985(-96)) {
			if (local26.anInterface20_3.method4045(arg0)) {
				@Pc(44) Object local44 = local26.method8985();
				if (local44 != null) {
					if (local26.method8986()) {
						@Pc(79) Class5_Sub5_Sub5_Sub2 local79 = new Class5_Sub5_Sub5_Sub2(arg0, local44, local26.anInt10470);
						this.aClass291_44.method6984(local26.aLong314, local79);
						this.aClass149_11.method2889(local79);
						local79.aLong312 = 0L;
						local26.method9327(1);
						local26.method9186();
					} else {
						this.aClass149_11.method2889(local26);
						local26.aLong312 = 0L;
					}
					return local44;
				}
				local26.method9327(1);
				local26.method9186();
				this.anInt10740 += local26.anInt10470;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/Object;IILclient!pt;)V")
	private void method9251(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface20 arg1) {
		if (this.anInt10744 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method9256(arg1);
		this.anInt10740--;
		while (this.anInt10740 < 0) {
			@Pc(46) Class5_Sub5_Sub5 local46 = (Class5_Sub5_Sub5) this.aClass149_11.method2886();
			this.method9254(local46, 30118);
		}
		@Pc(60) Class5_Sub5_Sub5_Sub2 local60 = new Class5_Sub5_Sub5_Sub2(arg1, arg0, 1);
		this.aClass291_44.method6984(arg1.method4044(), local60);
		this.aClass149_11.method2889(local60);
		local60.aLong312 = 0L;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)I")
	public int method9252() {
		return this.anInt10744;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	public void method9253() {
		if (Static549.aClass283_1 == null) {
			return;
		}
		for (@Pc(13) Class5_Sub5_Sub5 local13 = (Class5_Sub5_Sub5) this.aClass149_11.method2890(); local13 != null; local13 = (Class5_Sub5_Sub5) this.aClass149_11.method2894()) {
			if (local13.method8986()) {
				if (local13.method8985() == null) {
					local13.method9327(1);
					local13.method9186();
					this.anInt10740 += local13.anInt10470;
				}
			} else if ((long) 5 < ++local13.aLong312) {
				@Pc(41) Class5_Sub5_Sub5 local41 = Static549.aClass283_1.method8584(local13);
				this.aClass291_44.method6984(local13.aLong314, local41);
				Static206.method2964(local13, local41);
				local13.method9327(1);
				local13.method9186();
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!kv;I)V")
	private void method9254(@OriginalArg(0) Class5_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			arg0.method9327(arg1 ^ 0x75A7);
			arg0.method9186();
			this.anInt10740 += arg0.anInt10470;
		}
		if (arg1 != 30118) {
			this.aClass291_44 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
	public int method9255() {
		return this.anInt10740;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!pt;Z)V")
	private void method9256(@OriginalArg(0) Interface20 arg0) {
		@Pc(9) long local9 = arg0.method4044();
		for (@Pc(16) Class5_Sub5_Sub5 local16 = (Class5_Sub5_Sub5) this.aClass291_44.method6993(local9, 1); local16 != null; local16 = (Class5_Sub5_Sub5) this.aClass291_44.method6985(-101)) {
			if (local16.anInterface20_3.method4045(arg0)) {
				this.method9254(local16, 30118);
				break;
			}
		}
		if (false) {
			this.method9254((Class5_Sub5_Sub5) null, 61);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
	public void method9257() {
		this.aClass149_11.method2891();
		this.aClass291_44.method6986(-91);
		this.anInt10740 = this.anInt10744;
	}
}
