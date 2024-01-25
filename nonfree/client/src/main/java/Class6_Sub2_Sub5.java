import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 {

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "[Lclient!pv;")
	public Class291[] aClass291Array1;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
	private final int anInt2247;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) int arg0) {
		this.anInt2247 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z")
	public boolean method2149() {
		if (this.aClass291Array1 != null) {
			return true;
		}
		@Pc(38) int[] local38;
		@Pc(45) int local45;
		if (this.aByteArrayArray37 == null) {
			@Pc(16) Class223 local16 = Static74.aClass223_15;
			synchronized (Static74.aClass223_15) {
				if (!Static74.aClass223_15.method5270(this.anInt2247)) {
					return false;
				}
				local38 = Static74.aClass223_15.method5286(this.anInt2247);
				this.aByteArrayArray37 = new byte[local38.length][];
				for (local45 = 0; local45 < local38.length; local45++) {
					this.aByteArrayArray37[local45] = Static74.aClass223_15.method5267(local38[local45], this.anInt2247);
				}
			}
		}
		@Pc(80) boolean local80 = true;
		for (@Pc(82) int local82 = 0; local82 < this.aByteArrayArray37.length; local82++) {
			@Pc(89) byte[] local89 = this.aByteArrayArray37[local82];
			@Pc(94) Class6_Sub15 local94 = new Class6_Sub15(local89);
			local94.anInt3174 = 1;
			local45 = local94.method3018();
			@Pc(103) Class223 local103 = Static254.aClass223_57;
			synchronized (Static254.aClass223_57) {
				local80 &= Static254.aClass223_57.method5285(local45);
			}
		}
		if (!local80) {
			return false;
		}
		@Pc(135) Class340 local135 = new Class340();
		@Pc(137) Class223 local137 = Static74.aClass223_15;
		synchronized (Static74.aClass223_15) {
			@Pc(145) int local145 = Static74.aClass223_15.method5264(this.anInt2247);
			this.aClass291Array1 = new Class291[local145];
			local38 = Static74.aClass223_15.method5286(this.anInt2247);
		}
		for (local45 = 0; local45 < local38.length; local45++) {
			@Pc(174) byte[] local174 = this.aByteArrayArray37[local45];
			@Pc(179) Class6_Sub15 local179 = new Class6_Sub15(local174);
			local179.anInt3174 = 1;
			@Pc(186) int local186 = local179.method3018();
			@Pc(188) Class6_Sub5 local188 = null;
			for (@Pc(193) Class6_Sub5 local193 = (Class6_Sub5) local135.method8124(); local193 != null; local193 = (Class6_Sub5) local135.method8134()) {
				if (local186 == local193.anInt442) {
					local188 = local193;
					break;
				}
			}
			if (local188 == null) {
				@Pc(223) Class223 local223 = Static254.aClass223_57;
				synchronized (Static254.aClass223_57) {
					local188 = new Class6_Sub5(local186, Static254.aClass223_57.method5275(local186));
				}
				local135.method8131(local188);
			}
			this.aClass291Array1[local38[local45]] = new Class291(local174, local188);
		}
		this.aByteArrayArray37 = null;
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z")
	public boolean method2150(@OriginalArg(1) int arg0) {
		return this.aClass291Array1[arg0].aBoolean610;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)Z")
	public boolean method2152(@OriginalArg(0) int arg0) {
		return this.aClass291Array1[arg0].aBoolean611;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)Z")
	public boolean method2153(@OriginalArg(1) int arg0) {
		return this.aClass291Array1[arg0].aBoolean612;
	}
}
