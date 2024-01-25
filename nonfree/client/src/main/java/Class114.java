import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class114 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
	public int anInt3377;

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "Lclient!tp;")
	public Class315 aClass315_2;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLclient!fd;)V")
	public void method2977(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6538();
			if (local3 == 0) {
				return;
			}
			this.method2980(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method2980(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3381 = arg0.method6535();
		} else if (arg1 == 2) {
			this.anInt3377 = arg0.method6506();
		} else if (arg1 == 3) {
			this.aBoolean261 = true;
		} else if (arg1 == 4) {
			this.anInt3381 = -1;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!oa;BZI)Lclient!xa;")
	public Class37 method2982(@OriginalArg(0) Class15 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(22) long local22 = (long) (this.anInt3381 | arg2 << 16 | (arg1 ? 262144 : 0) | arg0.anInt6343 << 19);
		@Pc(30) Class37 local30 = (Class37) this.aClass315_2.aClass211_61.method5534(local22);
		if (local30 != null) {
			return local30;
		} else if (this.aClass315_2.aClass254_127.method6417(this.anInt3381)) {
			@Pc(58) Class20 local58 = Static599.method814(this.aClass315_2.aClass254_127, this.anInt3381, 0);
			if (local58 != null) {
				local58.anInt709 = local58.anInt705 = local58.anInt704 = local58.anInt708 = 0;
				if (arg1) {
					local58.method810();
				}
				for (@Pc(78) int local78 = 0; local78 < arg2; local78++) {
					local58.method817();
				}
			}
			local30 = arg0.method5275(local58, true);
			if (local30 != null) {
				this.aClass315_2.aClass211_61.method5529(local22, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)Z")
	public boolean method2983() {
		return this.aClass315_2.aClass254_127.method6417(this.anInt3381);
	}
}
