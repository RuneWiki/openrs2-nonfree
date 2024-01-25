import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class146 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public int anInt3722;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!sl;")
	public Class334 aClass334_4;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public int anInt3728;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method3246(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7695(109);
			if (local12 == 0) {
				return;
			}
			this.method3248(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method3248(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt3728 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt3722 = arg1.method7719();
			return;
		} else if (arg0 == 3) {
			this.aBoolean271 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt3728 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZLclient!ha;)Lclient!fia;")
	public Class45 method3249(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(23) long local23 = (long) (arg2.anInt7839 << 19 | arg0 << 16 | this.anInt3728 | (arg1 ? 262144 : 0));
		@Pc(31) Class45 local31 = (Class45) this.aClass334_4.aClass317_63.method7882(local23);
		if (local31 != null) {
			return local31;
		} else if (this.aClass334_4.aClass310_110.method7785(this.anInt3728)) {
			@Pc(62) Class266 local62 = Static697.method6466(this.aClass334_4.aClass310_110, this.anInt3728, 0);
			if (local62 != null) {
				local62.anInt7306 = local62.anInt7304 = local62.anInt7307 = local62.anInt7308 = 0;
				if (arg1) {
					local62.method6464();
				}
				for (@Pc(86) int local86 = 0; local86 < arg0; local86++) {
					local62.method6472();
				}
			}
			local31 = arg2.method6964(local62, true);
			if (local31 != null) {
				this.aClass334_4.aClass317_63.method7875(local23, local31);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
	public boolean method3250() {
		return this.aClass334_4.aClass310_110.method7785(this.anInt3728);
	}
}
