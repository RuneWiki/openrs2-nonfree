import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class5_Sub4_Sub21 extends Class5_Sub4 {

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray46;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "[I")
	public int[] anIntArray824;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "[I")
	private int[] anIntArray825;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!ji;")
	public Class171 aClass171_2;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Z")
	public boolean aBoolean830 = true;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ee;B)Ljava/lang/String;")
	public String method8745(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray825 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray825.length; local15++) {
				local10.append(this.aStringArray46[local15]);
				local10.append(this.aClass171_2.method4003(this.method8751(local15), arg0.method8599(Static367.method5750(this.anIntArray825[local15]).anInt4695), this.anIntArrayArray64[local15]));
			}
		}
		local10.append(this.aStringArray46[this.aStringArray46.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method8746() {
		if (this.anIntArray824 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray824.length; local18++) {
				this.anIntArray824[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!ee;B)V")
	public void method8747(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8645();
			if (local9 == 0) {
				return;
			}
			this.method8750(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ee;B[I)V")
	public void method8748(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray825 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray825.length && arg1.length > local11; local11++) {
			@Pc(19) int local19 = this.method8751(local11).anInt4698;
			if (local19 > 0) {
				arg0.method8598((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)I")
	public int method8749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray825 == null || arg0 < 0 || this.anIntArray825.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray64[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray64[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray64[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ee;IB)V")
	private void method8750(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray46 = Static132.method1987(arg0.method8617(), '<');
			return;
		}
		@Pc(16) int local16;
		@Pc(22) int local22;
		if (arg1 == 2) {
			local16 = arg0.method8645();
			this.anIntArray824 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray824[local22] = arg0.method8631();
			}
		} else if (arg1 == 3) {
			local16 = arg0.method8645();
			this.anIntArrayArray64 = new int[local16][];
			this.anIntArray825 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				@Pc(70) int local70 = arg0.method8631();
				@Pc(74) Class186 local74 = Static367.method5750(local70);
				if (local74 != null) {
					this.anIntArray825[local22] = local70;
					this.anIntArrayArray64[local22] = new int[local74.anInt4699];
					for (@Pc(90) int local90 = 0; local90 < local74.anInt4699; local90++) {
						this.anIntArrayArray64[local22][local90] = arg0.method8631();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean830 = false;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)Lclient!kg;")
	public Class186 method8751(@OriginalArg(1) int arg0) {
		return this.anIntArray825 == null || arg0 < 0 || this.anIntArray825.length < arg0 ? null : Static367.method5750(this.anIntArray825[arg0]);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	public int method8752() {
		return this.anIntArray825 == null ? 0 : this.anIntArray825.length;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public String method8753() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray46 == null) {
			return "";
		}
		local10.append(this.aStringArray46[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray46.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray46[local30]);
		}
		return local10.toString();
	}
}
