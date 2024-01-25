import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "Lclient!nj;")
	private Class212 aClass212_42;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLclient!dga;I)V")
	private void method7859(@OriginalArg(1) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(23) int local23 = arg0.method6041();
		@Pc(30) int local30;
		if (this.aClass212_42 == null) {
			local30 = Static516.method7313(local23);
			this.aClass212_42 = new Class212(local30);
		}
		for (local30 = 0; local30 < local23; local30++) {
			@Pc(51) boolean local51 = arg0.method6041() == 1;
			@Pc(55) int local55 = arg0.method5988();
			@Pc(64) Class6 local64;
			if (local51) {
				local64 = new Class6_Sub6(arg0.method5991());
			} else {
				local64 = new Class6_Sub9(arg0.method6027());
			}
			this.aClass212_42.method5104((long) local55, local64);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)I")
	public int method7860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass212_42 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub9 local21 = (Class6_Sub9) this.aClass212_42.method5106((long) arg1);
			return local21 == null ? arg0 : local21.anInt1006;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!dga;)V")
	public void method7861(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method7859(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method7864(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass212_42 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub6 local16 = (Class6_Sub6) this.aClass212_42.method5106((long) arg1);
			return local16 == null ? arg0 : local16.aString7;
		}
	}
}
