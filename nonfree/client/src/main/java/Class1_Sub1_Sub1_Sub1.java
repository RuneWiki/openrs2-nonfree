import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GRLQOIQT")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!GRLQOIQT", name = "t", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!GRLQOIQT", name = "u", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!GRLQOIQT", name = "o", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!GRLQOIQT", name = "v", descriptor = "I")
	private int anInt152 = 5;

	@OriginalMember(owner = "client!GRLQOIQT", name = "w", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!GRLQOIQT", name = "n", descriptor = "Lclient!MKJLFPRH;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!GRLQOIQT", name = "p", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!GRLQOIQT", name = "q", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!GRLQOIQT", name = "r", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!GRLQOIQT", name = "s", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!GRLQOIQT", name = "m", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!GRLQOIQT", name = "<init>", descriptor = "(IIIBIIII)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(17) boolean local17 = false;
			this.aClass25_1 = Class25.aClass25Array1[arg0];
			this.anInt146 = arg2;
			this.anInt147 = arg4;
			this.anInt148 = arg1;
			this.anInt149 = arg5;
			this.anInt145 = arg6 + arg7;
			this.aBoolean40 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("53719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRLQOIQT", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt152 || arg0 > this.anInt152) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(18) Class1_Sub1_Sub1_Sub4 local18 = this.aClass25_1.method334();
			if (local18 == null) {
				return null;
			}
			@Pc(30) int local30 = this.aClass25_1.aClass29_1.anIntArray140[this.anInt150];
			@Pc(41) Class1_Sub1_Sub1_Sub4 local41 = new Class1_Sub1_Sub1_Sub4(Class42.method479(local30), false, true, true, local18);
			if (!this.aBoolean40) {
				local41.method246();
				local41.method247(local30);
				local41.anIntArrayArray11 = null;
				local41.anIntArrayArray10 = null;
			}
			if (this.aClass25_1.anInt475 != 128 || this.aClass25_1.anInt476 != 128) {
				local41.method255(this.aClass25_1.anInt475, this.aClass25_1.anInt476, this.aClass25_1.anInt475);
			}
			if (this.aClass25_1.anInt477 != 0) {
				if (this.aClass25_1.anInt477 == 90) {
					local41.method250();
				}
				if (this.aClass25_1.anInt477 == 180) {
					local41.method250();
					local41.method250();
				}
				if (this.aClass25_1.anInt477 == 270) {
					local41.method250();
					local41.method250();
					local41.method250();
				}
			}
			local41.method256(this.aClass25_1.anInt478 + 64, this.aClass25_1.anInt479 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("146, " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRLQOIQT", name = "a", descriptor = "(BI)V")
	public void method127(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 9) {
				this.anInt151 += arg1;
				while (true) {
					do {
						do {
							if (this.anInt151 <= this.aClass25_1.aClass29_1.method377(this.anInt150, this.aBoolean41)) {
								return;
							}
							this.anInt151 -= this.aClass25_1.aClass29_1.method377(this.anInt150, this.aBoolean41) + 1;
							this.anInt150++;
						} while (this.anInt150 < this.aClass25_1.aClass29_1.anInt502);
					} while (this.anInt150 >= 0 && this.anInt150 < this.aClass25_1.aClass29_1.anInt502);
					this.anInt150 = 0;
					this.aBoolean40 = true;
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("32662, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
