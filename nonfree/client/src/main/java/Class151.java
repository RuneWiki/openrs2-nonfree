import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class151 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public int anInt4611;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public int anInt4613;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
	public boolean aBoolean434 = false;

	static {
		new Class34("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!bg;III)V")
	private void method4144(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4613 = arg0.method4556();
		} else if (arg1 == 2) {
			this.anInt4611 = arg0.method4514();
		} else if (arg1 == 3) {
			this.aBoolean434 = true;
		} else if (arg1 == 4) {
			this.anInt4613 = -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZILclient!uo;)Lclient!c;")
	public Class5 method4146(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class32 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt2472 << 19 | arg0 << 16 | this.anInt4613 | (arg1 ? 262144 : 0));
		@Pc(40) Class5 local40 = (Class5) Static237.aClass87_41.method2482(local24);
		if (local40 != null) {
			return local40;
		} else if (Static171.aClass216_60.method5651(this.anInt4613)) {
			@Pc(58) Class99 local58 = Static366.method2655(Static171.aClass216_60, this.anInt4613, 0);
			if (local58 != null) {
				local58.anInt2873 = local58.anInt2874 = local58.anInt2872 = local58.anInt2876 = 0;
				if (arg1) {
					local58.method2667();
				}
				for (@Pc(78) int local78 = 0; local78 < arg0; local78++) {
					local58.method2663();
				}
			}
			local40 = arg2.method2149(local58);
			if (local40 != null) {
				Static237.aClass87_41.method2481(local40, local24);
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Z")
	public boolean method4149() {
		return Static171.aClass216_60.method5651(this.anInt4613);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!bg;I)V")
	public void method4150(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method4532();
			if (local15 == 0) {
				return;
			}
			this.method4144(arg0, local15, arg1);
		}
	}
}
