import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class275 {

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!an;")
	private final Class18 aClass18_5 = new Class18();

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	private int anInt8155;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
	private final int anInt8152;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!waa;")
	private final Class350 aClass350_34;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	public Class275(@OriginalArg(0) int arg0) {
		this.anInt8155 = arg0;
		this.anInt8152 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass350_34 = new Class350(local16);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/Object;ILclient!be;I)V")
	private void method6767(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface1 arg1) {
		if (this.anInt8152 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6776(arg1);
		this.anInt8155--;
		while (this.anInt8155 < 0) {
			@Pc(36) Class4_Sub5_Sub1 local36 = (Class4_Sub5_Sub1) this.aClass18_5.method226();
			this.method6778(local36);
		}
		@Pc(50) Class4_Sub5_Sub1_Sub2 local50 = new Class4_Sub5_Sub1_Sub2(arg1, arg0, 1);
		this.aClass350_34.method8199(arg1.method3303(), local50);
		this.aClass18_5.method219(local50);
		local50.aLong257 = 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!be;Ljava/lang/Object;)V")
	public void method6768(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method6767(arg1, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method6770() {
		for (@Pc(16) Class4_Sub5_Sub1 local16 = (Class4_Sub5_Sub1) this.aClass18_5.method221(); local16 != null; local16 = (Class4_Sub5_Sub1) this.aClass18_5.method218()) {
			if (local16.method3330()) {
				local16.method8379();
				local16.method8015();
				this.anInt8155 += local16.anInt3729;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!be;)Ljava/lang/Object;")
	public Object method6772(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method3303();
		for (@Pc(16) Class4_Sub5_Sub1 local16 = (Class4_Sub5_Sub1) this.aClass350_34.method8207(local9); local16 != null; local16 = (Class4_Sub5_Sub1) this.aClass350_34.method8200()) {
			if (local16.anInterface1_3.method3304(arg0)) {
				@Pc(33) Object local33 = local16.method3332();
				if (local33 != null) {
					if (local16.method3330()) {
						@Pc(72) Class4_Sub5_Sub1_Sub2 local72 = new Class4_Sub5_Sub1_Sub2(arg0, local33, local16.anInt3729);
						this.aClass350_34.method8199(local16.aLong268, local72);
						this.aClass18_5.method219(local72);
						local72.aLong257 = 0L;
						local16.method8379();
						local16.method8015();
					} else {
						this.aClass18_5.method219(local16);
						local16.aLong257 = 0L;
					}
					return local33;
				}
				local16.method8379();
				local16.method8015();
				this.anInt8155 += local16.anInt3729;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	public void method6773() {
		this.aClass18_5.method227();
		this.aClass350_34.method8203();
		this.anInt8155 = this.anInt8152;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
	public int method6774() {
		return this.anInt8155;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(ILclient!be;)V")
	private void method6776(@OriginalArg(1) Interface1 arg0) {
		@Pc(15) long local15 = arg0.method3303();
		for (@Pc(22) Class4_Sub5_Sub1 local22 = (Class4_Sub5_Sub1) this.aClass350_34.method8207(local15); local22 != null; local22 = (Class4_Sub5_Sub1) this.aClass350_34.method8200()) {
			if (local22.anInterface1_3.method3304(arg0)) {
				this.method6778(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)I")
	public int method6777() {
		return this.anInt8152;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!as;)V")
	private void method6778(@OriginalArg(1) Class4_Sub5_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method8379();
			arg0.method8015();
			this.anInt8155 += arg0.anInt3729;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
	public void method6780() {
		if (Static534.aClass346_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub5_Sub1 local13 = (Class4_Sub5_Sub1) this.aClass18_5.method221(); local13 != null; local13 = (Class4_Sub5_Sub1) this.aClass18_5.method218()) {
			if (local13.method3330()) {
				if (local13.method3332() == null) {
					local13.method8379();
					local13.method8015();
					this.anInt8155 += local13.anInt3729;
				}
			} else if ((long) 5 < ++local13.aLong257) {
				@Pc(56) Class4_Sub5_Sub1 local56 = Static534.aClass346_1.method8107(local13);
				this.aClass350_34.method8199(local13.aLong268, local56);
				Static199.method3403(local56, local13);
				local13.method8379();
				local13.method8015();
			}
		}
	}
}
