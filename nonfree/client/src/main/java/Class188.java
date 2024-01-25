import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class188 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!kg;")
	public Class135 aClass135_2;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int anInt5031;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method3937(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method4463();
			if (local19 == 0) {
				return;
			}
			this.method3938(arg0, local19);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!dh;I)V")
	private void method3938(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5032 = arg0.method4485();
		} else if (arg1 == 2) {
			this.anInt5031 = arg0.method4493();
		} else if (arg1 == 3) {
			this.aBoolean403 = true;
		} else if (arg1 == 4) {
			this.anInt5032 = -1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLclient!qa;I)Lclient!f;")
	public Class49 method3940(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(24) long local24 = (long) ((arg1 ? 262144 : 0) | this.anInt5032 | arg0 << 16 | arg2.anInt4410 << 19);
		@Pc(34) Class49 local34 = (Class49) this.aClass135_2.aClass167_56.method3386(local24);
		if (local34 != null) {
			return local34;
		} else if (this.aClass135_2.aClass113_69.method2253(this.anInt5032)) {
			@Pc(56) Class100 local56 = Static458.method1922(this.aClass135_2.aClass113_69, this.anInt5032, 0);
			if (local56 != null) {
				local56.anInt2450 = local56.anInt2452 = local56.anInt2453 = local56.anInt2449 = 0;
				if (arg1) {
					local56.method1925();
				}
				for (@Pc(76) int local76 = 0; local76 < arg0; local76++) {
					local56.method1918();
				}
			}
			local34 = arg2.method3540(local56);
			if (local34 != null) {
				this.aClass135_2.aClass167_56.method3392(local34, local24);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Z")
	public boolean method3941() {
		return this.aClass135_2.aClass113_69.method2253(this.anInt5032);
	}
}
