import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class404 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public int anInt11190;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public int anInt11191;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!wla;")
	public Class405 aClass405_4;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
	public boolean aBoolean807 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!rba;)V")
	private void method9346(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt11190 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt11191 = arg1.method5307();
		} else if (arg0 == 3) {
			this.aBoolean807 = true;
		} else if (arg0 == 4) {
			this.anInt11190 = -1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLclient!rba;)V")
	public void method9347(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-124);
			if (local5 == 0) {
				return;
			}
			this.method9346(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZLclient!ha;)Lclient!bka;")
	public Class9 method9349(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class67 arg2) {
		@Pc(25) long local25 = (long) ((arg1 ? 262144 : 0) | this.anInt11190 | arg0 << 16 | arg2.anInt9130 << 19);
		@Pc(33) Class9 local33 = (Class9) this.aClass405_4.aClass338_64.method8049(local25);
		if (local33 != null) {
			return local33;
		} else if (this.aClass405_4.aClass221_162.method5068(this.anInt11190)) {
			@Pc(57) Class194 local57 = Static728.method4757(this.aClass405_4.aClass221_162, this.anInt11190, 0);
			if (local57 != null) {
				local57.anInt5598 = local57.anInt5594 = local57.anInt5593 = local57.anInt5597 = 0;
				if (arg1) {
					local57.method4763();
				}
				for (@Pc(91) int local91 = 0; local91 < arg0; local91++) {
					local57.method4752();
				}
			}
			local33 = arg2.method7659(local57, true);
			if (local33 != null) {
				this.aClass405_4.aClass338_64.method8044(local25, local33);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Z")
	public boolean method9350() {
		return this.aClass405_4.aClass221_162.method5068(this.anInt11190);
	}
}
