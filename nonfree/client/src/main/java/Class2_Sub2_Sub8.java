import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lclient!ai;")
	private final Class6 aClass6_1;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "Z")
	public final boolean aBoolean75;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "I")
	public final int anInt1423;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
	public int anInt1412;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	private int anInt1414;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
	private int anInt1420;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
	private int anInt1418;

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "I")
	private int anInt1425;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!oa;)V")
	public Class2_Sub2_Sub8(@OriginalArg(0) Class2_Sub18 arg0) {
		this.aClass6_1 = new Class6(arg0);
		@Pc(14) int local14 = arg0.method2387();
		this.aBoolean73 = (local14 & 0x2) != 0;
		this.aBoolean75 = (local14 & 0x1) != 0;
		this.anInt1423 = arg0.method2387();
		this.anInt1412 = arg0.method2353();
		this.anInt1414 = arg0.method2387();
		if (this.anInt1414 == 255) {
			this.anInt1414 = 256;
		}
		@Pc(58) int local58 = arg0.method2387();
		@Pc(62) int local62 = arg0.method2387();
		this.anInt1420 = (local62 & 0x3F) - 6;
		this.anInt1418 = local62 >> 6 & 0x3;
		this.anInt1425 = local58 >> 6 & 0x3;
		arg0.method2387();
		arg0.method2387();
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		this.aClass6_1 = new Class6();
		this.aBoolean75 = true;
		this.anInt1423 = 1;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
	public void method982(@OriginalArg(0) int arg0) {
		if (this.anIntArray223 == null) {
			return;
		}
		@Pc(39) short local39;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(91) int[] local91;
		if (this.anInt1418 != 0) {
			if (Static106.anIntArray409 == null || this.anIntArray223.length > Static106.anIntArray409.length) {
				Static106.anIntArray409 = new int[this.anIntArray223.length];
			}
			if (this.anIntArray223.length == 4096) {
				local39 = 64;
			} else {
				local39 = 128;
			}
			local46 = this.anIntArray223.length;
			local53 = this.anInt1420 * local39 * arg0;
			local57 = local46 - 1;
			if (this.anInt1418 == 2) {
				local53 = -local53;
			}
			for (local66 = 0; local66 < local46; local66++) {
				local73 = local57 & local53 + local66;
				Static106.anIntArray409[local66] = this.anIntArray223[local73];
			}
			local91 = this.anIntArray223;
			this.anIntArray223 = Static106.anIntArray409;
			Static106.anIntArray409 = local91;
		}
		if (this.anInt1425 == 0) {
			return;
		}
		if (Static106.anIntArray409 == null || Static106.anIntArray409.length < this.anIntArray223.length) {
			Static106.anIntArray409 = new int[this.anIntArray223.length];
		}
		if (this.anIntArray223.length == 4096) {
			local39 = 64;
		} else {
			local39 = 128;
		}
		local46 = this.anIntArray223.length;
		local53 = arg0 * this.anInt1420;
		if (this.anInt1425 == 1) {
			local53 = -local53;
		}
		local57 = local39 - 1;
		for (local66 = 0; local66 < local46; local66 += local39) {
			for (local73 = 0; local73 < local39; local73++) {
				@Pc(163) int local163 = local66 + (local73 + local53 & local57);
				@Pc(167) int local167 = local66 + local73;
				Static106.anIntArray409[local167] = this.anIntArray223[local163];
			}
		}
		local91 = this.anIntArray223;
		this.anIntArray223 = Static106.anIntArray409;
		Static106.anIntArray409 = local91;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ke;ILclient!qb;)Z")
	public boolean method983(@OriginalArg(0) Class43 arg0, @OriginalArg(2) Interface2 arg1) {
		return this.aClass6_1.method148(arg1, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!qb;IFLclient!ke;B)[I")
	public int[] method984(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class43 arg3) {
		if (this.anIntArray223 == null || arg2 != this.aFloat2) {
			if (!this.aClass6_1.method148(arg0, arg3)) {
				return null;
			}
			@Pc(41) int local41 = arg1 < this.anInt1423 ? arg1 : this.anInt1423;
			this.anIntArray223 = this.aClass6_1.method146(arg3, local41, local41, (double) arg2, true, arg0);
			this.aFloat2 = arg2;
		}
		return this.anIntArray223;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!qb;ZLclient!ke;)[I")
	public int[] method985(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Class43 arg2) {
		if (this.aClass6_1.method148(arg1, arg2)) {
			@Pc(30) int local30 = arg0 < this.anInt1423 ? arg0 : this.anInt1423;
			return this.aClass6_1.method146(arg2, local30, local30, 1.0D, false, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
