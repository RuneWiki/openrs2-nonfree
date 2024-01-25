import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class10_Sub1_Sub12 extends Class10_Sub1 {

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray31;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "Lclient!ud;")
	public Class248 aClass248_2;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Z")
	public boolean aBoolean324 = true;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
	public int method3852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray468 == null || arg1 < 0 || arg1 > this.anIntArray468.length) {
			return -1;
		} else if (this.anIntArrayArray44[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray44[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray44[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILclient!nn;)V")
	private void method3853(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.aStringArray31 = Static253.method3686('<', arg1.method2478());
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (arg0 == 2) {
			local42 = arg1.method2502();
			this.anIntArray467 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.anIntArray467[local52] = arg1.method2485();
			}
		} else if (arg0 == 3) {
			local42 = arg1.method2502();
			this.anIntArrayArray44 = new int[local42][];
			this.anIntArray468 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				@Pc(58) int local58 = arg1.method2485();
				@Pc(62) Class127 local62 = Static337.method4523(local58);
				if (local62 != null) {
					this.anIntArray468[local52] = local58;
					this.anIntArrayArray44[local52] = new int[local62.anInt3829];
					for (@Pc(78) int local78 = 0; local78 < local62.anInt3829; local78++) {
						this.anIntArrayArray44[local52][local78] = arg1.method2485();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean324 = false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!nn;[II)V")
	public void method3854(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray468 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray468.length; local17++) {
			if (arg1.length <= local17) {
				return;
			}
			@Pc(25) int local25 = this.method3857(local17).anInt3827;
			if (local25 > 0) {
				arg0.method2491(local25, (long) arg1[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method3855() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray31 == null) {
			return "";
		}
		local10.append(this.aStringArray31[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray31.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray31[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)V")
	public void method3856() {
		if (this.anIntArray467 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray467.length; local6++) {
				this.anIntArray467[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Lclient!je;")
	public Class127 method3857(@OriginalArg(1) int arg0) {
		return this.anIntArray468 == null || arg0 < 0 || this.anIntArray468.length < arg0 ? null : Static337.method4523(this.anIntArray468[arg0]);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!nn;)Ljava/lang/String;")
	public String method3860(@OriginalArg(1) Class10_Sub8 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray468 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray468.length; local15++) {
				local10.append(this.aStringArray31[local15]);
				local10.append(this.aClass248_2.method5370(arg0.method2510(Static337.method4523(this.anIntArray468[local15]).anInt3832), this.method3857(local15), this.anIntArrayArray44[local15]));
			}
		}
		local10.append(this.aStringArray31[this.aStringArray31.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!nn;)V")
	public void method3861(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2502();
			if (local7 == 0) {
				return;
			}
			this.method3853(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I")
	public int method3863() {
		return this.anIntArray468 == null ? 0 : this.anIntArray468.length;
	}
}
