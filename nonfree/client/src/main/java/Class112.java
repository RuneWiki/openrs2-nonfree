import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class112 {

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "Lclient!wu;")
	private final Class380 aClass380_45;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	private final int anInt3002;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "[[I")
	private final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray51;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class112(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_45 = arg2;
		this.aClass380_45.method8631(1);
		@Pc(22) Class2_Sub22 local22 = new Class2_Sub22(this.aClass380_45.method8620(0, 0));
		@Pc(26) int local26 = local22.method8547();
		if (local26 > 3) {
			this.anIntArrayArray9 = new int[0][];
			this.aBooleanArray51 = new boolean[0];
			this.anInt3002 = -1;
		} else {
			@Pc(35) int local35 = local22.method8547();
			@Pc(38) Class8[] local38 = Static120.method1759();
			@Pc(40) boolean local40 = true;
			@Pc(50) int local50;
			@Pc(56) int local56;
			if (local38.length == local35) {
				for (local50 = 0; local50 < local38.length; local50++) {
					local56 = local22.method8547();
					if (local38[local50].anInt138 != local56) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local50 = local22.method8547();
				local56 = local22.method8547();
				if (local26 <= 2) {
					this.anInt3002 = -1;
				} else {
					this.anInt3002 = local22.method8526();
				}
				this.anIntArrayArray9 = new int[local56 + 1][];
				this.aBooleanArray51 = new boolean[local56 + 1];
				@Pc(114) int local114;
				for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
					local114 = local22.method8547();
					this.aBooleanArray51[local114] = local22.method8547() == 1;
					@Pc(132) int local132 = local22.method8546();
					@Pc(144) int local144;
					if (this.anInt3002 == -1) {
						this.anIntArrayArray9[local114] = new int[local132];
						for (local144 = 0; local144 < local132; local144++) {
							this.anIntArrayArray9[local114][local144] = local22.method8546();
						}
					} else {
						this.anIntArrayArray9[local114] = new int[local132 + 1];
						this.anIntArrayArray9[local114][0] = this.anInt3002;
						for (local144 = 0; local144 < local132; local144++) {
							this.anIntArrayArray9[local114][local144 + 1] = local22.method8546();
						}
					}
				}
				for (local114 = 0; local114 < local56 + 1; local114++) {
					if (this.anIntArrayArray9[local114] == null) {
						if (this.anInt3002 == -1) {
							this.anIntArrayArray9[local114] = new int[0];
						} else {
							this.anIntArrayArray9[local114] = new int[] { this.anInt3002 };
						}
					}
				}
			} else {
				this.anIntArrayArray9 = new int[0][];
				this.anInt3002 = -1;
				this.aBooleanArray51 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
	public int[] method2515(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray9.length) {
			return this.anInt3002 == -1 ? new int[0] : new int[] { this.anInt3002 };
		} else if (this.aBooleanArray51[arg0] && this.anIntArrayArray9[arg0].length > 1) {
			@Pc(57) int local57 = this.anInt3002 == -1 ? 0 : 1;
			@Pc(61) Random local61 = new Random();
			@Pc(68) int[] local68 = new int[this.anIntArrayArray9[arg0].length];
			Static653.method5397(this.anIntArrayArray9[arg0], 0, local68, 0, local68.length);
			for (@Pc(80) int local80 = local57; local80 < local68.length; local80++) {
				@Pc(92) int local92 = local57 + Static239.method3351(local68.length - local57, local61);
				@Pc(96) int local96 = local68[local80];
				local68[local80] = local68[local92];
				local68[local92] = local96;
			}
			return local68;
		} else {
			return this.anIntArrayArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)Lclient!gk;")
	public Class126 method2516(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass380_45.method8620(1, arg0);
		@Pc(14) Class126 local14 = new Class126();
		local14.method2731(new Class2_Sub22(local10));
		return local14;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Z")
	public boolean method2517() {
		return this.anInt3002 != -1;
	}
}
