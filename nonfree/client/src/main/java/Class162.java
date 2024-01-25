import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class162 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public int anInt3981;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!bc;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "[Lclient!bc;")
	public Class26[] aClass26Array1;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "[[B")
	public byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public final int anInt3982;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([BI[B)V")
	public Class162(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt3982 = Static363.method5288(arg0.length, arg0);
		if (arg1 != this.anInt3982) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray38 = Static645.method8911(arg0.length, arg0, 0);
			for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
				if (this.aByteArray38[local45] != arg2[local45]) {
					throw new RuntimeException();
				}
			}
		}
		this.method3666(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BI)V")
	private void method3666(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class5_Sub36 local12 = new Class5_Sub36(Static262.method4273(arg0));
		@Pc(16) int local16 = local12.method7291();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3980 = local12.method7268();
		} else {
			this.anInt3980 = 0;
		}
		@Pc(50) int local50 = local12.method7291();
		@Pc(59) boolean local59 = (local50 & 0x1) != 0;
		this.anInt3979 = local12.method7333();
		@Pc(73) boolean local73 = (local50 & 0x2) != 0;
		@Pc(75) int local75 = 0;
		this.anIntArray199 = new int[this.anInt3979];
		@Pc(82) int local82 = -1;
		for (@Pc(84) int local84 = 0; local84 < this.anInt3979; local84++) {
			this.anIntArray199[local84] = local75 += local12.method7333();
			if (this.anIntArray199[local84] > local82) {
				local82 = this.anIntArray199[local84];
			}
		}
		this.anInt3981 = local82 + 1;
		this.anIntArray197 = new int[this.anInt3981];
		this.anIntArrayArray32 = new int[this.anInt3981][];
		this.anIntArray200 = new int[this.anInt3981];
		this.anIntArray198 = new int[this.anInt3981];
		if (local73) {
			this.aByteArrayArray11 = new byte[this.anInt3981][];
		}
		this.anIntArray201 = new int[this.anInt3981];
		@Pc(165) int local165;
		@Pc(185) int local185;
		if (local59) {
			this.anIntArray196 = new int[this.anInt3981];
			for (local165 = 0; local165 < this.anInt3981; local165++) {
				this.anIntArray196[local165] = -1;
			}
			for (local185 = 0; local185 < this.anInt3979; local185++) {
				this.anIntArray196[this.anIntArray199[local185]] = local12.method7268();
			}
			this.aClass26_1 = new Class26(this.anIntArray196);
		}
		for (local165 = 0; local165 < this.anInt3979; local165++) {
			this.anIntArray200[this.anIntArray199[local165]] = local12.method7268();
		}
		if (local73) {
			for (local185 = 0; local185 < this.anInt3979; local185++) {
				@Pc(251) byte[] local251 = new byte[64];
				local12.method7297(local251, 0, 64);
				this.aByteArrayArray11[this.anIntArray199[local185]] = local251;
			}
		}
		for (local185 = 0; local185 < this.anInt3979; local185++) {
			this.anIntArray201[this.anIntArray199[local185]] = local12.method7268();
		}
		if (102 < 88) {
			Static232.method3665();
		}
		for (@Pc(304) int local304 = 0; local304 < this.anInt3979; local304++) {
			this.anIntArray198[this.anIntArray199[local304]] = local12.method7333();
		}
		@Pc(340) int local340;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(357) int local357;
		@Pc(374) int local374;
		for (@Pc(329) int local329 = 0; local329 < this.anInt3979; local329++) {
			local340 = this.anIntArray199[local329];
			local345 = this.anIntArray198[local340];
			local75 = 0;
			local349 = -1;
			this.anIntArrayArray32[local340] = new int[local345];
			for (local357 = 0; local357 < local345; local357++) {
				local374 = this.anIntArrayArray32[local340][local357] = local75 += local12.method7333();
				if (local349 < local374) {
					local349 = local374;
				}
			}
			this.anIntArray197[local340] = local349 + 1;
			if (local345 == local349 + 1) {
				this.anIntArrayArray32[local340] = null;
			}
		}
		if (!local59) {
			return;
		}
		this.aClass26Array1 = new Class26[local82 + 1];
		this.anIntArrayArray31 = new int[local82 + 1][];
		for (local340 = 0; local340 < this.anInt3979; local340++) {
			local345 = this.anIntArray199[local340];
			local349 = this.anIntArray198[local345];
			this.anIntArrayArray31[local345] = new int[this.anIntArray197[local345]];
			for (local357 = 0; local357 < this.anIntArray197[local345]; local357++) {
				this.anIntArrayArray31[local345][local357] = -1;
			}
			for (local374 = 0; local374 < local349; local374++) {
				@Pc(503) int local503;
				if (this.anIntArrayArray32[local345] == null) {
					local503 = local374;
				} else {
					local503 = this.anIntArrayArray32[local345][local374];
				}
				this.anIntArrayArray31[local345][local503] = local12.method7268();
			}
			this.aClass26Array1[local345] = new Class26(this.anIntArrayArray31[local345]);
		}
	}
}
