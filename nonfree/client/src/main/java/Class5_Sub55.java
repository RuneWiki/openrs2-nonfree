import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class5_Sub55 extends Class5 {

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "[I")
	private int[] anIntArray624;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "[Lclient!wl;")
	public Class395[] aClass395Array1;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "J")
	public long aLong310;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
	private boolean aBoolean768;

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "Ljava/lang/String;")
	public String aString123 = null;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
	public int anInt10883 = 0;

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "Z")
	private boolean aBoolean766 = true;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class5_Sub55(@OriginalArg(0) Class5_Sub36 arg0) {
		this.method9188(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!wq;)V")
	private void method9188(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(9) int local9 = arg0.method7291();
		if ((local9 & 0x2) != 0) {
			this.aBoolean766 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean768 = true;
		}
		super.aLong312 = arg0.method7304();
		this.aLong310 = arg0.method7304();
		this.aString123 = arg0.method7281();
		arg0.method7291();
		this.aByte149 = arg0.method7318();
		this.aByte150 = arg0.method7318();
		this.anInt10883 = arg0.method7333();
		if (this.anInt10883 <= 0) {
			return;
		}
		this.aClass395Array1 = new Class395[this.anInt10883];
		for (@Pc(82) int local82 = 0; local82 < this.anInt10883; local82++) {
			@Pc(88) Class395 local88 = new Class395();
			if (this.aBoolean768) {
				arg0.method7304();
			}
			if (this.aBoolean766) {
				local88.aString120 = arg0.method7281();
			}
			local88.aByte147 = arg0.method7318();
			local88.anInt10839 = arg0.method7333();
			this.aClass395Array1[local82] = local88;
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
	private void method9189(@OriginalArg(1) int arg0) {
		if (this.aClass395Array1 == null) {
			this.aClass395Array1 = new Class395[arg0];
		} else {
			Static693.method8316(this.aClass395Array1, 0, this.aClass395Array1 = new Class395[arg0], 0, this.anInt10883);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!wl;)V")
	public void method9191(@OriginalArg(1) Class395 arg0) {
		if (this.aClass395Array1 == null || this.aClass395Array1.length <= this.anInt10883) {
			this.method9189(this.anInt10883 + 5);
		}
		this.aClass395Array1[this.anInt10883++] = arg0;
		this.anIntArray624 = null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method9192(@OriginalArg(1) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt10883; local15++) {
			if (this.aClass395Array1[local15].aString120.equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[I")
	public int[] method9193() {
		if (this.anIntArray624 == null) {
			@Pc(13) String[] local13 = new String[this.anInt10883];
			this.anIntArray624 = new int[this.anInt10883];
			@Pc(20) int local20 = 0;
			while (this.anInt10883 > local20) {
				local13[local20] = this.aClass395Array1[local20].aString120;
				this.anIntArray624[local20] = local20++;
			}
			Static166.method3018(local13, this.anIntArray624);
		}
		return this.anIntArray624;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(II)V")
	public void method9194(@OriginalArg(0) int arg0) {
		this.anInt10883--;
		if (this.anInt10883 == 0) {
			this.aClass395Array1 = null;
		} else {
			Static693.method8316(this.aClass395Array1, arg0 + 1, this.aClass395Array1, arg0, this.anInt10883 - arg0);
		}
		this.anIntArray624 = null;
	}
}
