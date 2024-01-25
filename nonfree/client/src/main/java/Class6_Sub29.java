import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class6_Sub29 extends Class6 {

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
	public long aLong182;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[Lclient!jw;")
	public Class200[] aClass200Array1;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "Z")
	private boolean aBoolean409 = true;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public int anInt5466 = 0;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "Ljava/lang/String;")
	public String aString61 = null;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class6_Sub29(@OriginalArg(0) Class6_Sub15 arg0) {
		this.method4976(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!jc;)V")
	private void method4976(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method3030();
		if ((local9 & 0x2) != 0) {
			this.aBoolean409 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean408 = true;
		}
		super.aLong346 = arg0.method3049();
		this.aLong182 = arg0.method3049();
		this.aString61 = arg0.method3046();
		arg0.method3030();
		this.aByte81 = arg0.method3027();
		this.aByte82 = arg0.method3027();
		this.anInt5466 = arg0.method3018();
		if (this.anInt5466 <= 0) {
			return;
		}
		this.aClass200Array1 = new Class200[this.anInt5466];
		for (@Pc(83) int local83 = 0; local83 < this.anInt5466; local83++) {
			@Pc(89) Class200 local89 = new Class200();
			if (this.aBoolean408) {
				arg0.method3049();
			}
			if (this.aBoolean409) {
				local89.aString58 = arg0.method3046();
			}
			local89.aByte80 = arg0.method3027();
			local89.anInt5266 = arg0.method3018();
			this.aClass200Array1[local83] = local89;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
	private void method4977(@OriginalArg(0) int arg0) {
		if (this.aClass200Array1 == null) {
			this.aClass200Array1 = new Class200[arg0];
		} else {
			Static695.method5647(this.aClass200Array1, 0, this.aClass200Array1 = new Class200[arg0], 0, this.anInt5466);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4979(@OriginalArg(1) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5466; local15++) {
			if (this.aClass200Array1[local15].aString58.equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!jw;B)V")
	public void method4980(@OriginalArg(0) Class200 arg0) {
		if (this.aClass200Array1 == null || this.aClass200Array1.length <= this.anInt5466) {
			this.method4977(this.anInt5466 + 5);
		}
		this.aClass200Array1[this.anInt5466++] = arg0;
		this.anIntArray316 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
	public void method4982(@OriginalArg(1) int arg0) {
		this.anInt5466--;
		if (this.anInt5466 == 0) {
			this.aClass200Array1 = null;
		} else {
			Static695.method5647(this.aClass200Array1, arg0 + 1, this.aClass200Array1, arg0, this.anInt5466 - arg0);
		}
		this.anIntArray316 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[I")
	public int[] method4984() {
		if (this.anIntArray316 == null) {
			@Pc(20) String[] local20 = new String[this.anInt5466];
			this.anIntArray316 = new int[this.anInt5466];
			@Pc(27) int local27 = 0;
			while (this.anInt5466 > local27) {
				local20[local27] = this.aClass200Array1[local27].aString58;
				this.anIntArray316[local27] = local27++;
			}
			Static273.method4619(this.anIntArray316, local20);
		}
		return this.anIntArray316;
	}
}
