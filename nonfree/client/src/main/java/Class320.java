import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class320 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Lclient!rg;")
	public Class290 aClass290_5;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "[I")
	private final int[] anIntArray500 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!un;)V")
	public void method7520(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4905();
			if (local9 == 0) {
				return;
			}
			this.method7526(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Lclient!kk;")
	public Class191 method7521() {
		@Pc(8) Class191[] local8 = new Class191[5];
		@Pc(10) int local10 = 0;
		@Pc(19) Class176 local19 = this.aClass290_5.aClass176_109;
		@Pc(23) int local23;
		synchronized (this.aClass290_5.aClass176_109) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray500[local23] != -1) {
					local8[local10++] = Static91.method5485(this.aClass290_5.aClass176_109, this.anIntArray500[local23]);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local8[local57] != null && local8[local57].anInt5621 < 13) {
				local8[local57].method4770();
			}
		}
		@Pc(87) Class191 local87 = new Class191(local8, local10);
		if (this.aShortArray124 != null) {
			for (local23 = 0; local23 < this.aShortArray124.length; local23++) {
				local87.method4756(this.aShortArray124[local23], this.aShortArray125[local23]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local23 = 0; local23 < this.aShortArray126.length; local23++) {
				local87.method4763(this.aShortArray126[local23], this.aShortArray127[local23]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Z")
	public boolean method7522() {
		if (this.anIntArray499 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(21) Class176 local21 = this.aClass290_5.aClass176_109;
		synchronized (this.aClass290_5.aClass176_109) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray499.length; local25++) {
				if (!this.aClass290_5.aClass176_109.method3977(this.anIntArray499[local25], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
	public boolean method7524() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class176 local11 = this.aClass290_5.aClass176_109;
		synchronized (this.aClass290_5.aClass176_109) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray500[local15] != -1 && !this.aClass290_5.aClass176_109.method3977(this.anIntArray500[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Lclient!kk;")
	public Class191 method7525() {
		if (this.anIntArray499 == null) {
			return null;
		}
		@Pc(15) Class191[] local15 = new Class191[this.anIntArray499.length];
		@Pc(19) Class176 local19 = this.aClass290_5.aClass176_109;
		@Pc(30) int local30;
		synchronized (this.aClass290_5.aClass176_109) {
			local30 = 0;
			while (true) {
				if (local30 >= this.anIntArray499.length) {
					break;
				}
				local15[local30] = Static91.method5485(this.aClass290_5.aClass176_109, this.anIntArray499[local30]);
				local30++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray499.length; local59++) {
			if (local15[local59].anInt5621 < 13) {
				local15[local59].method4770();
			}
		}
		@Pc(89) Class191 local89;
		if (local15.length == 1) {
			local89 = local15[0];
		} else {
			local89 = new Class191(local15, local15.length);
		}
		if (local89 == null) {
			return null;
		}
		if (this.aShortArray124 != null) {
			for (local30 = 0; local30 < this.aShortArray124.length; local30++) {
				local89.method4756(this.aShortArray124[local30], this.aShortArray125[local30]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local30 = 0; local30 < this.aShortArray126.length; local30++) {
				local89.method4763(this.aShortArray126[local30], this.aShortArray127[local30]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!un;BI)V")
	private void method7526(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4905();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg1 == 2) {
			local19 = arg0.method4905();
			this.anIntArray499 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray499[local25] = arg0.method4936();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local19 = arg0.method4905();
				this.aShortArray124 = new short[local19];
				this.aShortArray125 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray124[local25] = (short) arg0.method4936();
					this.aShortArray125[local25] = (short) arg0.method4936();
				}
			} else if (arg1 == 41) {
				local19 = arg0.method4905();
				this.aShortArray127 = new short[local19];
				this.aShortArray126 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray126[local25] = (short) arg0.method4936();
					this.aShortArray127[local25] = (short) arg0.method4936();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray500[arg1 - 60] = arg0.method4936();
			}
		}
	}
}
