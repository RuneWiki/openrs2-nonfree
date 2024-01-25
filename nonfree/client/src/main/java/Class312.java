import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class312 {

	@OriginalMember(owner = "client!si", name = "w", descriptor = "[I")
	public static final int[] anIntArray518 = new int[256];

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!oga;")
	private final Class253 aClass253_9 = new Class253();

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	private final int anInt7762;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	private int anInt7751;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!efa;")
	private final Class90 aClass90_32;

	static {
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(20) int local20 = local17;
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				if ((local20 & 0x1) == 1) {
					local20 = local20 >>> 1 ^ 0xEDB88320;
				} else {
					local20 >>>= 0x1;
				}
			}
			anIntArray518[local17] = local20;
		}
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class312(@OriginalArg(0) int arg0) {
		this.anInt7762 = arg0;
		this.anInt7751 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass90_32 = new Class90(local16);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/Object;Lclient!pe;)V")
	public void method6260(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface19 arg1) {
		this.method6270(arg0, arg1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!pe;)V")
	private void method6261(@OriginalArg(1) Interface19 arg0) {
		@Pc(13) long local13 = arg0.method1668();
		for (@Pc(20) Class2_Sub2_Sub10 local20 = (Class2_Sub2_Sub10) this.aClass90_32.method1685(local13); local20 != null; local20 = (Class2_Sub2_Sub10) this.aClass90_32.method1682()) {
			if (local20.anInterface19_3.method1667(arg0)) {
				this.method6262(local20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!nv;)V")
	private void method6262(@OriginalArg(1) Class2_Sub2_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method7657();
			arg0.method7659();
			this.anInt7751 += arg0.anInt9560;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
	public int method6263() {
		return this.anInt7751;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public void method6265() {
		for (@Pc(18) Class2_Sub2_Sub10 local18 = (Class2_Sub2_Sub10) this.aClass253_9.method5321(); local18 != null; local18 = (Class2_Sub2_Sub10) this.aClass253_9.method5323()) {
			if (local18.method7664()) {
				local18.method7657();
				local18.method7659();
				this.anInt7751 += local18.anInt9560;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(ILclient!pe;)Ljava/lang/Object;")
	public Object method6266(@OriginalArg(1) Interface19 arg0) {
		@Pc(9) long local9 = arg0.method1668();
		for (@Pc(16) Class2_Sub2_Sub10 local16 = (Class2_Sub2_Sub10) this.aClass90_32.method1685(local9); local16 != null; local16 = (Class2_Sub2_Sub10) this.aClass90_32.method1682()) {
			if (local16.anInterface19_3.method1667(arg0)) {
				@Pc(28) Object local28 = local16.method7668();
				if (local28 != null) {
					if (local16.method7664()) {
						@Pc(57) Class2_Sub2_Sub10_Sub2 local57 = new Class2_Sub2_Sub10_Sub2(arg0, local28, local16.anInt9560);
						this.aClass90_32.method1684(local57, local16.aLong268);
						this.aClass253_9.method5329(local57);
						local57.aLong269 = 0L;
						local16.method7657();
						local16.method7659();
					} else {
						this.aClass253_9.method5329(local16);
						local16.aLong269 = 0L;
					}
					return local28;
				}
				local16.method7657();
				local16.method7659();
				this.anInt7751 += local16.anInt9560;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public void method6268() {
		if (Static5.aClass78_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub2_Sub10 local9 = (Class2_Sub2_Sub10) this.aClass253_9.method5321(); local9 != null; local9 = (Class2_Sub2_Sub10) this.aClass253_9.method5323()) {
			if (local9.method7664()) {
				if (local9.method7668() == null) {
					local9.method7657();
					local9.method7659();
					this.anInt7751 += local9.anInt9560;
				}
			} else if (++local9.aLong269 > (long) 5) {
				@Pc(31) Class2_Sub2_Sub10 local31 = Static5.aClass78_1.method1519(local9);
				this.aClass90_32.method1684(local31, local9.aLong268);
				Static321.method4669(local31, local9);
				local9.method7657();
				local9.method7659();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
	public void method6269() {
		this.aClass253_9.method5320();
		this.aClass90_32.method1678();
		this.anInt7751 = this.anInt7762;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/Object;Lclient!pe;B)V")
	private void method6270(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface19 arg1) {
		if (this.anInt7762 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6261(arg1);
		this.anInt7751--;
		while (this.anInt7751 < 0) {
			@Pc(32) Class2_Sub2_Sub10 local32 = (Class2_Sub2_Sub10) this.aClass253_9.method5327();
			this.method6262(local32);
		}
		@Pc(54) Class2_Sub2_Sub10_Sub2 local54 = new Class2_Sub2_Sub10_Sub2(arg1, arg0, 1);
		this.aClass90_32.method1684(local54, arg1.method1668());
		this.aClass253_9.method5329(local54);
		local54.aLong269 = 0L;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)I")
	public int method6271() {
		return this.anInt7762;
	}
}
