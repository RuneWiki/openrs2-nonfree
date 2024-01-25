import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class140 {

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public int anInt4432;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!kl;")
	public Class165 aClass165_4;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public int anInt4440;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Z")
	public boolean method3854() {
		return this.aClass165_4.aClass160_57.method4213(this.anInt4440);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBZLclient!qa;)Lclient!ha;")
	public Class12 method3857(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(27) long local27 = (long) (arg2.anInt9019 << 19 | this.anInt4440 | arg0 << 16 | (arg1 ? 262144 : 0));
		@Pc(35) Class12 local35 = (Class12) this.aClass165_4.aClass316_32.method7799(local27);
		if (local35 != null) {
			return local35;
		} else if (this.aClass165_4.aClass160_57.method4213(this.anInt4440)) {
			@Pc(57) Class242 local57 = Static559.method5942(this.aClass165_4.aClass160_57, this.anInt4440, 0);
			if (local57 != null) {
				local57.anInt6864 = local57.anInt6862 = local57.anInt6861 = local57.anInt6865 = 0;
				if (arg1) {
					local57.method5930();
				}
				for (@Pc(77) int local77 = 0; local77 < arg0; local77++) {
					local57.method5938();
				}
			}
			local35 = arg2.method7625(local57);
			if (local35 != null) {
				this.aClass165_4.aClass316_32.method7792(local27, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method3860(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method3861(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method3861(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4440 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt4432 = arg0.method3039();
		} else if (arg1 == 3) {
			this.aBoolean271 = true;
		} else if (arg1 == 4) {
			this.anInt4440 = -1;
		}
	}
}
