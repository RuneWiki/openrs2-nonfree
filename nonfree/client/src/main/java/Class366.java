import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class366 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!ik;")
	private final Class182 aClass182_116;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	private final int anInt9889;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class366(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_116 = arg2;
		this.aClass182_116.method3970(1);
		@Pc(22) Class3_Sub2 local22 = new Class3_Sub2(this.aClass182_116.method3985(0, 0));
		@Pc(26) int local26 = local22.method2048(255);
		if (local26 > 3) {
			this.anIntArrayArray56 = new int[0][];
			this.aBooleanArray30 = new boolean[0];
			this.anInt9889 = -1;
		} else {
			@Pc(46) int local46 = local22.method2048(255);
			@Pc(49) Class390[] local49 = Static50.method1254();
			@Pc(51) boolean local51 = true;
			@Pc(57) int local57;
			@Pc(63) int local63;
			if (local49.length == local46) {
				for (local57 = 0; local57 < local49.length; local57++) {
					local63 = local22.method2048(255);
					if (local63 != local49[local57].anInt10629) {
						local51 = false;
						break;
					}
				}
			} else {
				local51 = false;
			}
			if (local51) {
				local57 = local22.method2048(255);
				local63 = local22.method2048(255);
				if (local26 > 2) {
					this.anInt9889 = local22.method2017();
				} else {
					this.anInt9889 = -1;
				}
				this.anIntArrayArray56 = new int[local63 + 1][];
				this.aBooleanArray30 = new boolean[local63 + 1];
				@Pc(141) int local141;
				for (@Pc(135) int local135 = 0; local135 < local57; local135++) {
					local141 = local22.method2048(255);
					this.aBooleanArray30[local141] = local22.method2048(255) == 1;
					@Pc(158) int local158 = local22.method2028(-14795);
					@Pc(181) int local181;
					if (this.anInt9889 == -1) {
						this.anIntArrayArray56[local141] = new int[local158];
						for (local181 = 0; local181 < local158; local181++) {
							this.anIntArrayArray56[local141][local181] = local22.method2028(-14795);
						}
					} else {
						this.anIntArrayArray56[local141] = new int[local158 + 1];
						this.anIntArrayArray56[local141][0] = this.anInt9889;
						for (local181 = 0; local181 < local158; local181++) {
							this.anIntArrayArray56[local141][local181 + 1] = local22.method2028(-14795);
						}
					}
				}
				for (local141 = 0; local141 < local63 + 1; local141++) {
					if (this.anIntArrayArray56[local141] == null) {
						if (this.anInt9889 == -1) {
							this.anIntArrayArray56[local141] = new int[0];
						} else {
							this.anIntArrayArray56[local141] = new int[] { this.anInt9889 };
						}
					}
				}
			} else {
				this.anInt9889 = -1;
				this.anIntArrayArray56 = new int[0][];
				this.aBooleanArray30 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Z")
	public boolean method8417() {
		return this.anInt9889 != -1;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[I")
	public int[] method8421(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray56.length <= arg0) {
			return this.anInt9889 == -1 ? new int[0] : new int[] { this.anInt9889 };
		} else if (this.aBooleanArray30[arg0] && this.anIntArrayArray56[arg0].length > 1) {
			@Pc(66) int local66 = this.anInt9889 == -1 ? 0 : 1;
			@Pc(70) Random local70 = new Random();
			@Pc(77) int[] local77 = new int[this.anIntArrayArray56[arg0].length];
			Static732.method6321(this.anIntArrayArray56[arg0], 0, local77, 0, local77.length);
			for (@Pc(89) int local89 = local66; local89 < local77.length; local89++) {
				@Pc(103) int local103 = Static19.method614(local70, local77.length - local66) + local66;
				@Pc(107) int local107 = local77[local89];
				local77[local89] = local77[local103];
				local77[local103] = local107;
			}
			return local77;
		} else {
			return this.anIntArrayArray56[arg0];
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Lclient!bk;")
	public Class39 method8422(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16 = this.aClass182_116.method3985(arg0, 1);
		@Pc(20) Class39 local20 = new Class39();
		local20.method1253(new Class3_Sub2(local16));
		return local20;
	}
}
