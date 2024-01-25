import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "[I")
	public int[] anIntArray590;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Lclient!jd;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
	public int method4829() {
		return this.anIntArray591 == null ? 0 : this.anIntArray591.length;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)Lclient!rr;")
	public Class220 method4830(@OriginalArg(0) int arg0) {
		return this.anIntArray591 == null || arg0 < 0 || arg0 > this.anIntArray591.length ? null : Static59.method1109(this.anIntArray591[arg0]);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)I")
	public int method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray591 == null || arg1 < 0 || this.anIntArray591.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray51[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray51[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray51[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public void method4832() {
		if (this.anIntArray590 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray590.length; local4++) {
				this.anIntArray590[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!ia;)V")
	public void method4834(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method4836(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!ia;)V")
	private void method4836(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aStringArray40 = Static117.method1928('<', arg1.method1201());
			return;
		}
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg0 == 2) {
			local30 = arg1.method1171();
			this.anIntArray590 = new int[local30];
			for (local36 = 0; local36 < local30; local36++) {
				this.anIntArray590[local36] = arg1.method1177();
			}
		} else if (arg0 == 3) {
			local30 = arg1.method1171();
			this.anIntArray591 = new int[local30];
			this.anIntArrayArray51 = new int[local30][];
			for (local36 = 0; local36 < local30; local36++) {
				@Pc(80) int local80 = arg1.method1177();
				@Pc(86) Class220 local86 = Static59.method1109(local80);
				if (local86 != null) {
					this.anIntArray591[local36] = local80;
					this.anIntArrayArray51[local36] = new int[local86.anInt6593];
					for (@Pc(102) int local102 = 0; local102 < local86.anInt6593; local102++) {
						this.anIntArrayArray51[local36][local102] = arg1.method1177();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean399 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method4837() {
		@Pc(13) StringBuffer local13 = new StringBuffer(80);
		if (this.aStringArray40 == null) {
			return "";
		}
		local13.append(this.aStringArray40[0]);
		for (@Pc(27) int local27 = 1; local27 < this.aStringArray40.length; local27++) {
			local13.append("...");
			local13.append(this.aStringArray40[local27]);
		}
		return local13.toString();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ia;I)Ljava/lang/String;")
	public String method4838(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray591 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray591.length; local15++) {
				local10.append(this.aStringArray40[local15]);
				local10.append(this.aClass127_1.method3087(arg0.method1206(Static59.method1109(this.anIntArray591[local15]).anInt6588), this.anIntArrayArray51[local15], this.method4830(local15)));
			}
		}
		local10.append(this.aStringArray40[this.aStringArray40.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ia;B[I)V")
	public void method4840(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray591 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray591.length; local17++) {
			if (local17 >= arg1.length) {
				return;
			}
			@Pc(24) int local24 = this.method4830(local17).anInt6592;
			if (local24 > 0) {
				arg0.method1222((long) arg1[local17], local24);
			}
		}
	}
}
