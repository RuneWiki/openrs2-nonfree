import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class295 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	private final int anInt7801;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	private int anInt7802;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!nc;")
	private final Class243 aClass243_11;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!tca;")
	private final Class333 aClass333_31;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
	public Class295(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V")
	public Class295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass243_11 = new Class243();
		this.anInt7801 = arg0;
		this.anInt7802 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass333_31 = new Class333(local14);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
	public int method6461() {
		@Pc(14) int local14 = 0;
		for (@Pc(20) Class3_Sub5_Sub10 local20 = (Class3_Sub5_Sub10) this.aClass243_11.method5459(); local20 != null; local20 = (Class3_Sub5_Sub10) this.aClass243_11.method5453()) {
			if (!local20.method4382()) {
				local14++;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V")
	public void method6462(@OriginalArg(1) int arg0) {
		if (Static53.aClass103_1 == null) {
			return;
		}
		for (@Pc(17) Class3_Sub5_Sub10 local17 = (Class3_Sub5_Sub10) this.aClass243_11.method5459(); local17 != null; local17 = (Class3_Sub5_Sub10) this.aClass243_11.method5453()) {
			if (local17.method4382()) {
				if (local17.method4379() == null) {
					local17.method9034();
					local17.method9014();
					this.anInt7802 += local17.anInt5090;
				}
			} else if (++local17.aLong312 > (long) arg0) {
				@Pc(62) Class3_Sub5_Sub10 local62 = Static53.aClass103_1.method5491(local17);
				this.aClass333_31.method7488(local17.aLong313, local62);
				Static511.method6670(local17, local62);
				local17.method9034();
				local17.method9014();
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	public void method6463(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 > this.anInt7801) {
			throw new IllegalStateException("s>cs");
		}
		this.method6471(arg1);
		this.anInt7802 -= arg2;
		while (this.anInt7802 < 0) {
			@Pc(32) Class3_Sub5_Sub10 local32 = (Class3_Sub5_Sub10) this.aClass243_11.method5462();
			this.method6473(local32);
		}
		@Pc(48) Class3_Sub5_Sub10_Sub2 local48 = new Class3_Sub5_Sub10_Sub2(arg0, arg2);
		this.aClass333_31.method7488(arg1, local48);
		this.aClass243_11.method5457(local48);
		local48.aLong312 = 0L;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public void method6464() {
		this.aClass243_11.method5460();
		this.aClass333_31.method7485();
		this.anInt7802 = this.anInt7801;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I")
	public int method6465() {
		return this.anInt7802;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method6467() {
		@Pc(16) Class3_Sub5_Sub10 local16 = (Class3_Sub5_Sub10) this.aClass333_31.method7487();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4379();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class3_Sub5_Sub10 local26 = local16;
			local16 = (Class3_Sub5_Sub10) this.aClass333_31.method7487();
			local26.method9034();
			local26.method9014();
			this.anInt7802 += local26.anInt5090;
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method6468() {
		@Pc(11) Class3_Sub5_Sub10 local11 = (Class3_Sub5_Sub10) this.aClass333_31.method7490();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method4379();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub5_Sub10 local23 = local11;
			local11 = (Class3_Sub5_Sub10) this.aClass333_31.method7487();
			local23.method9034();
			local23.method9014();
			this.anInt7802 += local23.anInt5090;
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method6469(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method6463(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method6470(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub5_Sub10 local15 = (Class3_Sub5_Sub10) this.aClass333_31.method7489(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method4379();
		if (local23 == null) {
			local15.method9034();
			local15.method9014();
			this.anInt7802 += local15.anInt5090;
			return null;
		}
		if (local15.method4382()) {
			@Pc(61) Class3_Sub5_Sub10_Sub2 local61 = new Class3_Sub5_Sub10_Sub2(local23, local15.anInt5090);
			this.aClass333_31.method7488(local15.aLong313, local61);
			this.aClass243_11.method5457(local61);
			local61.aLong312 = 0L;
			local15.method9034();
			local15.method9014();
		} else {
			this.aClass243_11.method5457(local15);
			local15.aLong312 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JB)V")
	private void method6471(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub5_Sub10 local10 = (Class3_Sub5_Sub10) this.aClass333_31.method7489(arg0);
		this.method6473(local10);
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)I")
	public int method6472() {
		return this.anInt7801;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!jt;)V")
	private void method6473(@OriginalArg(1) Class3_Sub5_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method9034();
			arg0.method9014();
			this.anInt7802 += arg0.anInt5090;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	public void method6474() {
		for (@Pc(18) Class3_Sub5_Sub10 local18 = (Class3_Sub5_Sub10) this.aClass243_11.method5459(); local18 != null; local18 = (Class3_Sub5_Sub10) this.aClass243_11.method5453()) {
			if (local18.method4382()) {
				local18.method9034();
				local18.method9014();
				this.anInt7802 += local18.anInt5090;
			}
		}
	}
}
