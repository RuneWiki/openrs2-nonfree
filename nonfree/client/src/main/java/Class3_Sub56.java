import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class3_Sub56 extends Class3 {

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "[I")
	private int[] anIntArray639;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "J")
	public long aLong381;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "B")
	public byte aByte148;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
	private boolean aBoolean814;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "[Lclient!wp;")
	public Class407[] aClass407Array1;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
	public int anInt11265 = 0;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "Ljava/lang/String;")
	public String aString134 = null;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "Z")
	private boolean aBoolean813 = true;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class3_Sub56(@OriginalArg(0) Class3_Sub28 arg0) {
		this.method9411(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
	public void method9410(@OriginalArg(1) int arg0) {
		this.anInt11265--;
		if (this.anInt11265 == 0) {
			this.aClass407Array1 = null;
		} else {
			Static735.method9183(this.aClass407Array1, arg0 + 1, this.aClass407Array1, arg0, this.anInt11265 - arg0);
		}
		this.anIntArray639 = null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!rba;)V")
	private void method9411(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(9) int local9 = arg0.method5322(-27);
		if ((local9 & 0x2) != 0) {
			this.aBoolean813 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean814 = true;
		}
		super.aLong382 = arg0.method5287();
		this.aLong381 = arg0.method5287();
		this.aString134 = arg0.method5295();
		arg0.method5322(-29);
		this.aByte148 = arg0.method5288();
		this.aByte149 = arg0.method5288();
		this.anInt11265 = arg0.method5272();
		if (this.anInt11265 <= 0) {
			return;
		}
		this.aClass407Array1 = new Class407[this.anInt11265];
		for (@Pc(77) int local77 = 0; local77 < this.anInt11265; local77++) {
			@Pc(83) Class407 local83 = new Class407();
			if (this.aBoolean814) {
				arg0.method5287();
			}
			if (this.aBoolean813) {
				local83.aString133 = arg0.method5295();
			}
			local83.aByte147 = arg0.method5288();
			local83.anInt11258 = arg0.method5272();
			this.aClass407Array1[local77] = local83;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)[I")
	public int[] method9412() {
		if (this.anIntArray639 == null) {
			@Pc(14) String[] local14 = new String[this.anInt11265];
			this.anIntArray639 = new int[this.anInt11265];
			@Pc(21) int local21 = 0;
			while (local21 < this.anInt11265) {
				local14[local21] = this.aClass407Array1[local21].aString133;
				this.anIntArray639[local21] = local21++;
			}
			Static32.method466(local14, this.anIntArray639);
		}
		return this.anIntArray639;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	private void method9414(@OriginalArg(0) int arg0) {
		if (this.aClass407Array1 == null) {
			this.aClass407Array1 = new Class407[arg0];
		} else {
			Static735.method9183(this.aClass407Array1, 0, this.aClass407Array1 = new Class407[arg0], 0, this.anInt11265);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method9416(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt11265; local7++) {
			if (this.aClass407Array1[local7].aString133.equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!wp;B)V")
	public void method9417(@OriginalArg(0) Class407 arg0) {
		if (this.aClass407Array1 == null || this.aClass407Array1.length <= this.anInt11265) {
			this.method9414(this.anInt11265 + 5);
		}
		this.aClass407Array1[this.anInt11265++] = arg0;
		this.anIntArray639 = null;
	}
}
