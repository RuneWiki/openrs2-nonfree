import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Lclient!mo;")
	public Class227 aClass227_3;

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray30;

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "Z")
	public boolean aBoolean439 = true;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILclient!gk;)V")
	private void method4785(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.aStringArray30 = Static439.method5762(arg1.method4494(), '<');
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (arg0 == 2) {
			local20 = arg1.method4464();
			this.anIntArray375 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray375[local30] = arg1.method4518();
			}
		} else if (arg0 == 3) {
			local20 = arg1.method4464();
			this.anIntArray376 = new int[local20];
			this.anIntArrayArray43 = new int[local20][];
			for (local30 = 0; local30 < local20; local30++) {
				@Pc(38) int local38 = arg1.method4518();
				@Pc(42) Class63 local42 = Static256.method3647(local38);
				if (local42 != null) {
					this.anIntArray376[local30] = local38;
					this.anIntArrayArray43[local30] = new int[local42.anInt1357];
					for (@Pc(58) int local58 = 0; local58 < local42.anInt1357; local58++) {
						this.anIntArrayArray43[local30][local58] = arg1.method4518();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean439 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)Lclient!cq;")
	public Class63 method4786(@OriginalArg(0) int arg0) {
		return this.anIntArray376 == null || arg0 < 0 || this.anIntArray376.length < arg0 ? null : Static256.method3647(this.anIntArray376[arg0]);
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)I")
	public int method4788() {
		return this.anIntArray376 == null ? 0 : this.anIntArray376.length;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public void method4789() {
		if (this.anIntArray375 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray375.length; local16++) {
				this.anIntArray375[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!gk;)Ljava/lang/String;")
	public String method4790(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray376 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray376.length; local22++) {
				local17.append(this.aStringArray30[local22]);
				local17.append(this.aClass227_3.method4796(this.method4786(local22), this.anIntArrayArray43[local22], arg0.method4457(Static256.method3647(this.anIntArray376[local22]).anInt1354)));
			}
		}
		local17.append(this.aStringArray30[this.aStringArray30.length - 1]);
		return local17.toString();
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method4792() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray30 == null) {
			return "";
		}
		local16.append(this.aStringArray30[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray30.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray30[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!gk;[IB)V")
	public void method4793(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray376 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray376.length && arg1.length > local11; local11++) {
			@Pc(19) int local19 = this.method4786(local11).anInt1355;
			if (local19 > 0) {
				arg0.method4497(local19, (long) arg1[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I")
	public int method4794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray376 == null || arg1 < 0 || arg1 > this.anIntArray376.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray43[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(BLclient!gk;)V")
	public void method4795(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method4785(local5, arg0);
		}
	}
}
