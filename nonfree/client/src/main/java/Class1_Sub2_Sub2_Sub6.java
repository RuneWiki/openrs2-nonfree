import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YSSTKYXW")
public final class Class1_Sub2_Sub2_Sub6 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!YSSTKYXW", name = "w", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YSSTKYXW", name = "k", descriptor = "I")
	private int anInt792 = 969;

	@OriginalMember(owner = "client!YSSTKYXW", name = "v", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!YSSTKYXW", name = "q", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!YSSTKYXW", name = "r", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!YSSTKYXW", name = "s", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!YSSTKYXW", name = "m", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!YSSTKYXW", name = "n", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!YSSTKYXW", name = "o", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!YSSTKYXW", name = "p", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!YSSTKYXW", name = "x", descriptor = "Lclient!QBINVEVU;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!YSSTKYXW", name = "l", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!YSSTKYXW", name = "z", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!YSSTKYXW", name = "t", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!YSSTKYXW", name = "u", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!YSSTKYXW", name = "y", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!YSSTKYXW", name = "<init>", descriptor = "(IIIIBIIIIZ)V")
	public Class1_Sub2_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt798 = arg7;
			this.anInt799 = arg0;
			this.anInt800 = arg3;
			this.anInt794 = arg5;
			this.anInt795 = arg1;
			this.anInt796 = arg6;
			this.anInt797 = arg8;
			if (arg2 != -1) {
				this.aClass36_2 = Class36.aClass36Array1[arg2];
				this.anInt793 = 0;
				this.anInt803 = client.anInt1045;
				if (arg9 && this.aClass36_2.anInt533 != -1) {
					this.anInt793 = (int) (Math.random() * (double) this.aClass36_2.anInt532);
					this.anInt803 -= (int) (Math.random() * (double) this.aClass36_2.method371(this.anInt793));
				}
			}
			@Pc(88) Class27 local88 = Class27.method282(this.anInt798);
			this.anInt801 = local88.anInt460;
			this.anInt802 = local88.anInt448;
			this.anIntArray209 = local88.anIntArray105;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("4888, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSSTKYXW", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass36_2 != null) {
				@Pc(11) int local11 = client.anInt1045 - this.anInt803;
				if (local11 > 100 && this.aClass36_2.anInt533 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass36_2.method371(this.anInt793)) {
								break label43;
							}
							local11 -= this.aClass36_2.method371(this.anInt793);
							this.anInt793++;
						} while (this.anInt793 < this.aClass36_2.anInt532);
						this.anInt793 -= this.aClass36_2.anInt533;
					} while (this.anInt793 >= 0 && this.anInt793 < this.aClass36_2.anInt532);
					this.aClass36_2 = null;
				}
				this.anInt803 = client.anInt1045 - local11;
				if (this.aClass36_2 != null) {
					local3 = this.aClass36_2.anIntArray131[this.anInt793];
				}
			}
			@Pc(95) Class27 local95;
			if (this.anIntArray209 == null) {
				local95 = Class27.method282(this.anInt798);
			} else {
				local95 = this.method575();
			}
			return local95 == null ? null : local95.method284(this.anInt799, this.anInt800, this.anInt794, this.anInt795, this.anInt796, this.anInt797, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("57540, " + -840 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSSTKYXW", name = "a", descriptor = "(Z)Lclient!MIQWCPVG;")
	private Class27 method575() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt801 != -1) {
				@Pc(16) Class29 local16 = Class29.aClass29Array1[this.anInt801];
				@Pc(19) int local19 = local16.anInt484;
				@Pc(22) int local22 = local16.anInt485;
				@Pc(25) int local25 = local16.anInt486;
				@Pc(31) int local31 = client.anIntArray262[local25 - local22];
				local1 = aClient5.anIntArray268[local19] >> local22 & local31;
			} else if (this.anInt802 != -1) {
				local1 = aClient5.anIntArray268[this.anInt802];
			}
			return local1 < 0 || local1 >= this.anIntArray209.length || this.anIntArray209[local1] == -1 ? null : Class27.method282(this.anIntArray209[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("4704, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
