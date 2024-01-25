import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class307 {

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "Lclient!qn;")
	private final Class313 aClass313_40;

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
	private final int anInt8188;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	private int anInt8191;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "Lclient!gw;")
	private final Class147 aClass147_7;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(I)V")
	public Class307(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(II)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass147_7 = new Class147();
		this.anInt8188 = arg0;
		this.anInt8191 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass313_40 = new Class313(local14);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V")
	public void method6995(@OriginalArg(1) int arg0) {
		if (Static537.aClass273_1 == null) {
			return;
		}
		for (@Pc(11) Class3_Sub7_Sub8 local11 = (Class3_Sub7_Sub8) this.aClass147_7.method3334(); local11 != null; local11 = (Class3_Sub7_Sub8) this.aClass147_7.method3332()) {
			if (local11.method2599()) {
				if (local11.method2600() == null) {
					local11.method9596();
					local11.method9251();
					this.anInt8191 += local11.anInt2840;
				}
			} else if ((long) arg0 < ++local11.aLong336) {
				@Pc(41) Class3_Sub7_Sub8 local41 = Static537.aClass273_1.method6270(local11);
				this.aClass313_40.method7107(local11.aLong345, local41);
				Static461.method6257(local11, local41);
				local11.method9596();
				local11.method9251();
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!mia;I)V")
	private void method6996(@OriginalArg(0) Class3_Sub7_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method9596();
			arg0.method9251();
			this.anInt8191 += arg0.anInt2840;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(I)I")
	public int method6997() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub7_Sub8 local13 = (Class3_Sub7_Sub8) this.aClass147_7.method3334(); local13 != null; local13 = (Class3_Sub7_Sub8) this.aClass147_7.method3332()) {
			if (!local13.method2599()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	public void method6998() {
		for (@Pc(12) Class3_Sub7_Sub8 local12 = (Class3_Sub7_Sub8) this.aClass147_7.method3334(); local12 != null; local12 = (Class3_Sub7_Sub8) this.aClass147_7.method3332()) {
			if (local12.method2599()) {
				local12.method9596();
				local12.method9251();
				this.anInt8191 += local12.anInt2840;
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method7000(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method7003(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(JB)V")
	public void method7001(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub7_Sub8 local10 = (Class3_Sub7_Sub8) this.aClass313_40.method7104(arg0);
		this.method6996(local10);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method7002(@OriginalArg(1) long arg0) {
		@Pc(12) Class3_Sub7_Sub8 local12 = (Class3_Sub7_Sub8) this.aClass313_40.method7104(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(27) Object local27 = local12.method2600();
		if (local27 == null) {
			local12.method9596();
			local12.method9251();
			this.anInt8191 += local12.anInt2840;
			return null;
		}
		if (local12.method2599()) {
			@Pc(58) Class3_Sub7_Sub8_Sub1 local58 = new Class3_Sub7_Sub8_Sub1(local27, local12.anInt2840);
			this.aClass313_40.method7107(local12.aLong345, local58);
			this.aClass147_7.method3335(local58);
			local58.aLong336 = 0L;
			local12.method9596();
			local12.method9251();
		} else {
			this.aClass147_7.method3335(local12);
			local12.aLong336 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/Object;IJI)V")
	public void method7003(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8188 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method7001(arg1);
		this.anInt8191 -= arg2;
		while (this.anInt8191 < 0) {
			@Pc(39) Class3_Sub7_Sub8 local39 = (Class3_Sub7_Sub8) this.aClass147_7.method3333();
			this.method6996(local39);
		}
		@Pc(55) Class3_Sub7_Sub8_Sub1 local55 = new Class3_Sub7_Sub8_Sub1(arg0, arg2);
		this.aClass313_40.method7107(arg1, local55);
		this.aClass147_7.method3335(local55);
		local55.aLong336 = (long) 0;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)I")
	public int method7005() {
		return this.anInt8188;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
	public void method7006() {
		this.aClass147_7.method3331();
		this.aClass313_40.method7101();
		this.anInt8191 = this.anInt8188;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method7007() {
		@Pc(20) Class3_Sub7_Sub8 local20 = (Class3_Sub7_Sub8) this.aClass313_40.method7103();
		while (local20 != null) {
			@Pc(26) Object local26 = local20.method2600();
			if (local26 != null) {
				return local26;
			}
			@Pc(33) Class3_Sub7_Sub8 local33 = local20;
			local20 = (Class3_Sub7_Sub8) this.aClass313_40.method7110();
			local33.method9596();
			local33.method9251();
			this.anInt8191 += local33.anInt2840;
		}
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7008() {
		@Pc(11) Class3_Sub7_Sub8 local11 = (Class3_Sub7_Sub8) this.aClass313_40.method7110();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method2600();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class3_Sub7_Sub8 local21 = local11;
			local11 = (Class3_Sub7_Sub8) this.aClass313_40.method7110();
			local21.method9596();
			local21.method9251();
			this.anInt8191 += local21.anInt2840;
		}
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(I)I")
	public int method7010() {
		return this.anInt8191;
	}
}
