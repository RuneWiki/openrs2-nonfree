import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class195 {

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_139;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[[I")
	private final int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	private final int anInt5044;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class195(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_139 = arg2;
		this.aClass126_139.method3062(1);
		@Pc(22) Class5_Sub36 local22 = new Class5_Sub36(this.aClass126_139.method3086(0, 0));
		@Pc(26) int local26 = local22.method7291();
		if (local26 > 3) {
			this.anIntArrayArray37 = new int[0][];
			this.aBooleanArray13 = new boolean[0];
			this.anInt5044 = -1;
		} else {
			@Pc(46) int local46 = local22.method7291();
			@Pc(49) Class392[] local49 = Static202.method8633();
			@Pc(51) boolean local51 = true;
			@Pc(61) int local61;
			@Pc(67) int local67;
			if (local49.length == local46) {
				for (local61 = 0; local61 < local49.length; local61++) {
					local67 = local22.method7291();
					if (local67 != local49[local61].anInt10782) {
						local51 = false;
						break;
					}
				}
			} else {
				local51 = false;
			}
			if (local51) {
				local61 = local22.method7291();
				local67 = local22.method7291();
				if (local26 > 2) {
					this.anInt5044 = local22.method7303();
				} else {
					this.anInt5044 = -1;
				}
				this.aBooleanArray13 = new boolean[local67 + 1];
				this.anIntArrayArray37 = new int[local67 + 1][];
				@Pc(160) int local160;
				for (@Pc(154) int local154 = 0; local154 < local61; local154++) {
					local160 = local22.method7291();
					this.aBooleanArray13[local160] = local22.method7291() == 1;
					@Pc(179) int local179 = local22.method7333();
					@Pc(191) int local191;
					if (this.anInt5044 == -1) {
						this.anIntArrayArray37[local160] = new int[local179];
						for (local191 = 0; local191 < local179; local191++) {
							this.anIntArrayArray37[local160][local191] = local22.method7333();
						}
					} else {
						this.anIntArrayArray37[local160] = new int[local179 + 1];
						this.anIntArrayArray37[local160][0] = this.anInt5044;
						for (local191 = 0; local191 < local179; local191++) {
							this.anIntArrayArray37[local160][local191 + 1] = local22.method7333();
						}
					}
				}
				for (local160 = 0; local160 < local67 + 1; local160++) {
					if (this.anIntArrayArray37[local160] == null) {
						if (this.anInt5044 == -1) {
							this.anIntArrayArray37[local160] = new int[0];
						} else {
							this.anIntArrayArray37[local160] = new int[] { this.anInt5044 };
						}
					}
				}
			} else {
				this.anInt5044 = -1;
				this.aBooleanArray13 = new boolean[0];
				this.anIntArrayArray37 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)Lclient!eo;")
	public Class99 method4552(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass126_139.method3086(arg0, 1);
		@Pc(22) Class99 local22 = new Class99();
		local22.method1961(new Class5_Sub36(local18));
		return local22;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	public int[] method4553(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray37.length) {
			return this.anInt5044 == -1 ? new int[0] : new int[] { this.anInt5044 };
		} else if (this.aBooleanArray13[arg0] && this.anIntArrayArray37[arg0].length > 1) {
			@Pc(70) int local70 = this.anInt5044 == -1 ? 0 : 1;
			@Pc(74) Random local74 = new Random();
			@Pc(81) int[] local81 = new int[this.anIntArrayArray37[arg0].length];
			Static693.method8323(this.anIntArrayArray37[arg0], 0, local81, 0, local81.length);
			for (@Pc(93) int local93 = local70; local93 < local81.length; local93++) {
				@Pc(108) int local108 = Static131.method1936(local74, local81.length - local70) + local70;
				@Pc(112) int local112 = local81[local93];
				local81[local93] = local81[local108];
				local81[local108] = local112;
			}
			return local81;
		} else {
			return this.anIntArrayArray37[arg0];
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z")
	public boolean method4555() {
		return this.anInt5044 != -1;
	}
}
