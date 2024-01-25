import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class220 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public int anInt5983;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public int anInt5984;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!dl;")
	public Class79 aClass79_2;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z")
	public boolean method5163() {
		return this.aClass79_2.aClass238_52.method5568(this.anInt5984);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZILclient!ha;)Lclient!iea;")
	public Class31 method5164(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(22) long local22 = (long) (arg2.anInt9527 << 19 | (arg0 ? 262144 : 0) | this.anInt5984 | arg1 << 16);
		@Pc(30) Class31 local30 = (Class31) this.aClass79_2.aClass69_12.method1919(local22);
		if (local30 != null) {
			return local30;
		} else if (this.aClass79_2.aClass238_52.method5568(this.anInt5984)) {
			@Pc(52) Class139 local52 = Static654.method3455(this.aClass79_2.aClass238_52, this.anInt5984, 0);
			if (local52 != null) {
				local52.anInt3982 = local52.anInt3981 = local52.anInt3985 = local52.anInt3980 = 0;
				if (arg0) {
					local52.method3449();
				}
				for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
					local52.method3453();
				}
			}
			local30 = arg2.method8141(local52, true);
			if (local30 != null) {
				this.aClass79_2.aClass69_12.method1917(local22, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLclient!sl;I)V")
	private void method5167(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5984 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt5983 = arg0.method2835();
		} else if (arg1 == 3) {
			this.aBoolean424 = true;
		} else if (arg1 == 4) {
			this.anInt5984 = -1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method5168(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2859();
			if (local13 == 0) {
				return;
			}
			this.method5167(arg0, local13);
		}
	}
}
