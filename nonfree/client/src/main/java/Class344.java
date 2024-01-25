import java.io.File;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class344 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString133;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString134;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_128;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	private final int anInt9589;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "[[I")
	private final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray31;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString133 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString134 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class344(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_128 = arg2;
		this.aClass8_128.method280(1);
		@Pc(22) Class6_Sub23 local22 = new Class6_Sub23(this.aClass8_128.method262(0, 0));
		@Pc(26) int local26 = local22.method8374();
		if (local26 > 3) {
			this.anInt9589 = -1;
			this.anIntArrayArray55 = new int[0][];
			this.aBooleanArray31 = new boolean[0];
		} else {
			@Pc(45) int local45 = local22.method8374();
			@Pc(48) Class251[] local48 = Static482.method7039();
			@Pc(50) boolean local50 = true;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local48.length == local45) {
				for (local56 = 0; local56 < local48.length; local56++) {
					local62 = local22.method8374();
					if (local62 != local48[local56].anInt7262) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local56 = local22.method8374();
				local62 = local22.method8374();
				if (local26 > 2) {
					this.anInt9589 = local22.method8395();
				} else {
					this.anInt9589 = -1;
				}
				this.anIntArrayArray55 = new int[local62 + 1][];
				this.aBooleanArray31 = new boolean[local62 + 1];
				@Pc(126) int local126;
				for (@Pc(120) int local120 = 0; local120 < local56; local120++) {
					local126 = local22.method8374();
					this.aBooleanArray31[local126] = local22.method8374() == 1;
					@Pc(144) int local144 = local22.method8363();
					@Pc(156) int local156;
					if (this.anInt9589 == -1) {
						this.anIntArrayArray55[local126] = new int[local144];
						for (local156 = 0; local156 < local144; local156++) {
							this.anIntArrayArray55[local126][local156] = local22.method8363();
						}
					} else {
						this.anIntArrayArray55[local126] = new int[local144 + 1];
						this.anIntArrayArray55[local126][0] = this.anInt9589;
						for (local156 = 0; local156 < local144; local156++) {
							this.anIntArrayArray55[local126][local156 + 1] = local22.method8363();
						}
					}
				}
				for (local126 = 0; local126 < local62 + 1; local126++) {
					if (this.anIntArrayArray55[local126] == null) {
						if (this.anInt9589 == -1) {
							this.anIntArrayArray55[local126] = new int[0];
						} else {
							this.anIntArrayArray55[local126] = new int[] { this.anInt9589 };
						}
					}
				}
			} else {
				this.aBooleanArray31 = new boolean[0];
				this.anIntArrayArray55 = new int[0][];
				this.anInt9589 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)[I")
	public int[] method8077(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray55.length) {
			return this.anInt9589 == -1 ? new int[0] : new int[] { this.anInt9589 };
		} else if (this.aBooleanArray31[arg0] && this.anIntArrayArray55[arg0].length > 1) {
			@Pc(59) int local59 = this.anInt9589 == -1 ? 0 : 1;
			@Pc(63) Random local63 = new Random();
			@Pc(70) int[] local70 = new int[this.anIntArrayArray55[arg0].length];
			Static679.method1569(this.anIntArrayArray55[arg0], 0, local70, 0, local70.length);
			for (@Pc(90) int local90 = local59; local90 < local70.length; local90++) {
				@Pc(104) int local104 = Static316.method4556(local63, local70.length - local59) + local59;
				@Pc(108) int local108 = local70[local90];
				local70[local90] = local70[local104];
				local70[local104] = local108;
			}
			return local70;
		} else {
			return this.anIntArrayArray55[arg0];
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lclient!eu;")
	public Class96 method8080(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass8_128.method262(arg0, 1);
		@Pc(14) Class96 local14 = new Class96();
		local14.method2092(new Class6_Sub23(local10));
		return local14;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)Z")
	public boolean method8082() {
		return this.anInt9589 != -1;
	}
}
