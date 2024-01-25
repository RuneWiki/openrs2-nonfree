import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class175 implements Interface6 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!aw;")
	private final Class17 aClass17_3 = new Class17(256);

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!fo;")
	private final Class82 aClass82_67;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!fo;")
	private final Class82 aClass82_66;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[Lclient!iq;")
	private final Class114[] aClass114Array1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!fo;Lclient!fo;Lclient!fo;)V")
	public Class175(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_67 = arg2;
		this.aClass82_66 = arg1;
		@Pc(24) Class1_Sub28 local24 = new Class1_Sub28(arg0.method1817(0, 0));
		@Pc(28) int local28 = local24.method5335();
		this.aClass114Array1 = new Class114[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5337() == 1) {
				this.aClass114Array1[local34] = new Class114();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass114Array1[local56] != null) {
				this.aClass114Array1[local56].aBoolean340 = local24.method5337() == 0;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < local28; local81++) {
			if (this.aClass114Array1[local81] != null) {
				this.aClass114Array1[local81].aBoolean342 = local24.method5337() == 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < local28; local107++) {
			if (this.aClass114Array1[local107] != null) {
				this.aClass114Array1[local107].aBoolean339 = local24.method5337() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass114Array1[local139] != null) {
				this.aClass114Array1[local139].aBoolean341 = local24.method5337() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < local28; local171++) {
			if (this.aClass114Array1[local171] != null) {
				this.aClass114Array1[local171].aByte25 = local24.method5367();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass114Array1[local192] != null) {
				this.aClass114Array1[local192].aByte29 = local24.method5367();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < local28; local213++) {
			if (this.aClass114Array1[local213] != null) {
				this.aClass114Array1[local213].aByte30 = local24.method5367();
			}
		}
		for (@Pc(234) int local234 = 0; local234 < local28; local234++) {
			if (this.aClass114Array1[local234] != null) {
				this.aClass114Array1[local234].aByte26 = local24.method5367();
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local28; local259++) {
			if (this.aClass114Array1[local259] != null) {
				this.aClass114Array1[local259].aShort37 = (short) local24.method5335();
			}
		}
		for (@Pc(281) int local281 = 0; local281 < local28; local281++) {
			if (this.aClass114Array1[local281] != null) {
				this.aClass114Array1[local281].aByte28 = local24.method5367();
			}
		}
		for (@Pc(302) int local302 = 0; local302 < local28; local302++) {
			if (this.aClass114Array1[local302] != null) {
				this.aClass114Array1[local302].aByte27 = local24.method5367();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < local28; local323++) {
			if (this.aClass114Array1[local323] != null) {
				this.aClass114Array1[local323].aBoolean346 = local24.method5337() == 1;
			}
		}
		for (@Pc(355) int local355 = 0; local355 < local28; local355++) {
			if (this.aClass114Array1[local355] != null) {
				this.aClass114Array1[local355].aBoolean347 = local24.method5337() == 1;
			}
		}
		for (@Pc(383) int local383 = 0; local383 < local28; local383++) {
			if (this.aClass114Array1[local383] != null) {
				this.aClass114Array1[local383].aByte31 = local24.method5367();
			}
		}
		for (@Pc(408) int local408 = 0; local408 < local28; local408++) {
			if (this.aClass114Array1[local408] != null) {
				this.aClass114Array1[local408].aBoolean345 = local24.method5337() == 1;
			}
		}
		for (@Pc(434) int local434 = 0; local434 < local28; local434++) {
			if (this.aClass114Array1[local434] != null) {
				this.aClass114Array1[local434].aBoolean343 = local24.method5337() == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < local28; local466++) {
			if (this.aClass114Array1[local466] != null) {
				this.aClass114Array1[local466].aBoolean344 = local24.method5337() == 1;
			}
		}
		for (@Pc(494) int local494 = 0; local494 < local28; local494++) {
			if (this.aClass114Array1[local494] != null) {
				this.aClass114Array1[local494].anInt2891 = local24.method5337();
			}
		}
		for (@Pc(519) int local519 = 0; local519 < local28; local519++) {
			if (this.aClass114Array1[local519] != null) {
				this.aClass114Array1[local519].anInt2895 = local24.method5355();
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIFZ)[I")
	@Override
	public int[] method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method3939(arg2).method249(this, this.aClass82_67, (double) arg3, arg1, arg0, this.aClass114Array1[arg2].aBoolean347);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZIF)[F")
	@Override
	public float[] method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method3939(arg2).method247(arg0, this, this.aClass114Array1[arg2].aBoolean347, this.aClass82_67, arg1);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Lclient!ap;")
	private Class1_Sub5_Sub1 method3939(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub5 local10 = this.aClass17_3.method317((long) arg0);
		if (local10 != null) {
			return (Class1_Sub5_Sub1) local10;
		}
		@Pc(23) byte[] local23 = this.aClass82_66.method1815(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(41) Class1_Sub5_Sub1 local41 = new Class1_Sub5_Sub1(new Class1_Sub28(local23));
			this.aClass17_3.method315((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3934(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub5_Sub1 local15 = this.method3939(arg0);
		return local15 != null && local15.method246(this.aClass82_67, this);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Lclient!iq;")
	@Override
	public Class114 method3937(@OriginalArg(0) int arg0) {
		return this.aClass114Array1[arg0];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FZZIII)[I")
	@Override
	public int[] method3933(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3939(arg2).method245(this.aClass114Array1[arg2].aBoolean347, this.aClass82_67, arg1, arg4, arg3, this, (double) arg0);
	}
}
