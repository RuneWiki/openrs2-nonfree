import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Lclient!tn;")
	private Class190 aClass190_34;

	static {
		new Class85("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!rg;)V")
	private void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method5115();
		@Pc(25) int local25;
		if (this.aClass190_34 == null) {
			local25 = Static109.method1929(local18);
			this.aClass190_34 = new Class190(local25);
		}
		for (local25 = 0; local25 < local18; local25++) {
			@Pc(45) boolean local45 = arg1.method5115() == 1;
			@Pc(49) int local49 = arg1.method5072();
			@Pc(58) Class5 local58;
			if (local45) {
				local58 = new Class5_Sub25(arg1.method5064());
			} else {
				local58 = new Class5_Sub15(arg1.method5067());
			}
			this.aClass190_34.method5464(local58, (long) local49);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)I")
	public int method5974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass190_34 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub15 local16 = (Class5_Sub15) this.aClass190_34.method5466((long) arg0);
			return local16 == null ? arg1 : local16.anInt1686;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!rg;)V")
	public void method5976(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5115();
			if (local7 == 0) {
				return;
			}
			this.method5972(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method5977(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass190_34 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub25 local21 = (Class5_Sub25) this.aClass190_34.method5466((long) arg1);
			return local21 == null ? arg0 : local21.aString27;
		}
	}
}
