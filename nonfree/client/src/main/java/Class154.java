import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class154 {

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_55;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	private final int anInt5589;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class154(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_55 = arg2;
		this.aClass181_55.method5025(1);
		@Pc(22) Class3_Sub15 local22 = new Class3_Sub15(this.aClass181_55.method5023(0, 0));
		@Pc(26) int local26 = local22.method8401();
		if (local26 > 3) {
			this.anInt5589 = -1;
			this.anIntArrayArray52 = new int[0][];
			this.aBooleanArray14 = new boolean[0];
		} else {
			@Pc(45) int local45 = local22.method8401();
			@Pc(48) Class275[] local48 = Static448.method6790();
			@Pc(50) boolean local50 = true;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local48.length == local45) {
				for (local56 = 0; local56 < local48.length; local56++) {
					local62 = local22.method8401();
					if (local48[local56].anInt8349 != local62) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local56 = local22.method8401();
				local62 = local22.method8401();
				if (local26 <= 2) {
					this.anInt5589 = -1;
				} else {
					this.anInt5589 = local22.method8444();
				}
				this.anIntArrayArray52 = new int[local62 + 1][];
				this.aBooleanArray14 = new boolean[local62 + 1];
				@Pc(128) int local128;
				for (@Pc(122) int local122 = 0; local122 < local56; local122++) {
					local128 = local22.method8401();
					this.aBooleanArray14[local128] = local22.method8401() == 1;
					@Pc(146) int local146 = local22.method8414();
					@Pc(168) int local168;
					if (this.anInt5589 == -1) {
						this.anIntArrayArray52[local128] = new int[local146];
						for (local168 = 0; local168 < local146; local168++) {
							this.anIntArrayArray52[local128][local168] = local22.method8414();
						}
					} else {
						this.anIntArrayArray52[local128] = new int[local146 + 1];
						this.anIntArrayArray52[local128][0] = this.anInt5589;
						for (local168 = 0; local168 < local146; local168++) {
							this.anIntArrayArray52[local128][local168 + 1] = local22.method8414();
						}
					}
				}
				for (local128 = 0; local128 < local62 + 1; local128++) {
					if (this.anIntArrayArray52[local128] == null) {
						if (this.anInt5589 == -1) {
							this.anIntArrayArray52[local128] = new int[0];
						} else {
							this.anIntArrayArray52[local128] = new int[] { this.anInt5589 };
						}
					}
				}
			} else {
				this.anInt5589 = -1;
				this.anIntArrayArray52 = new int[0][];
				this.aBooleanArray14 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IB)[I")
	public int[] method4767(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray52.length) {
			return this.anInt5589 == -1 ? new int[0] : new int[] { this.anInt5589 };
		} else if (this.aBooleanArray14[arg0] && this.anIntArrayArray52[arg0].length > 1) {
			@Pc(62) int local62 = this.anInt5589 == -1 ? 0 : 1;
			@Pc(66) Random local66 = new Random();
			@Pc(73) int[] local73 = new int[this.anIntArrayArray52[arg0].length];
			Static655.method6408(this.anIntArrayArray52[arg0], 0, local73, 0, local73.length);
			for (@Pc(90) int local90 = local62; local90 < local73.length; local90++) {
				@Pc(104) int local104 = Static106.method2589(local66, local73.length - local62) + local62;
				@Pc(108) int local108 = local73[local90];
				local73[local90] = local73[local104];
				local73[local104] = local108;
			}
			return local73;
		} else {
			return this.anIntArrayArray52[arg0];
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Z")
	public boolean method4768() {
		return this.anInt5589 != -1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)Lclient!jha;")
	public Class160 method4769(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16 = this.aClass181_55.method5023(1, arg0);
		@Pc(20) Class160 local20 = new Class160();
		local20.method4870(new Class3_Sub15(local16));
		return local20;
	}
}
