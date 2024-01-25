import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class4_Sub5_Sub9 extends Class4_Sub5 {

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!rq;")
	public Class295 aClass295_2;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Z")
	public boolean aBoolean314 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!un;I)V")
	public void method3764(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method4905();
			if (local3 == 0) {
				return;
			}
			this.method3770(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lclient!un;I)Ljava/lang/String;")
	public String method3765(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray211 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray211.length; local15++) {
				local10.append(this.aStringArray24[local15]);
				local10.append(this.aClass295_2.method7019(arg0.method4930(Static206.method2649(this.anIntArray211[local15]).anInt3330), this.anIntArrayArray26[local15], this.method3768(local15)));
			}
		}
		local10.append(this.aStringArray24[this.aStringArray24.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	public int method3766() {
		return this.anIntArray211 == null ? 0 : this.anIntArray211.length;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[ILclient!un;)V")
	public void method3767(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (this.anIntArray211 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray211.length; local14++) {
			if (arg0.length <= local14) {
				return;
			}
			@Pc(21) int local21 = this.method3768(local14).anInt3327;
			if (local21 > 0) {
				arg1.method4922((long) arg0[local14], local21);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lclient!gfa;")
	public Class116 method3768(@OriginalArg(1) int arg0) {
		return this.anIntArray211 == null || arg0 < 0 || arg0 > this.anIntArray211.length ? null : Static206.method2649(this.anIntArray211[arg0]);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
	public int method3769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray211 == null || arg1 < 0 || arg1 > this.anIntArray211.length) {
			return -1;
		} else if (this.anIntArrayArray26[arg1] == null || arg0 < 0 || this.anIntArrayArray26[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray26[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!un;)V")
	private void method3770(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aStringArray24 = Static175.method3185('<', arg1.method4920());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method4905();
			this.anIntArray210 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray210[local27] = arg1.method4936();
			}
		} else if (arg0 == 3) {
			local21 = arg1.method4905();
			this.anIntArray211 = new int[local21];
			this.anIntArrayArray26 = new int[local21][];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(73) int local73 = arg1.method4936();
				@Pc(79) Class116 local79 = Static206.method2649(local73);
				if (local79 != null) {
					this.anIntArray211[local27] = local73;
					this.anIntArrayArray26[local27] = new int[local79.anInt3324];
					for (@Pc(95) int local95 = 0; local95 < local79.anInt3324; local95++) {
						this.anIntArrayArray26[local27][local95] = arg1.method4936();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean314 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	public void method3771() {
		if (this.anIntArray210 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray210.length; local16++) {
				this.anIntArray210[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method3774() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray24 == null) {
			return "";
		}
		local8.append(this.aStringArray24[0]);
		for (@Pc(27) int local27 = 1; local27 < this.aStringArray24.length; local27++) {
			local8.append("...");
			local8.append(this.aStringArray24[local27]);
		}
		return local8.toString();
	}
}
