import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class140 implements Interface13 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Z")
	private boolean aBoolean257;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!ha;")
	private Class95 aClass95_5;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "Lclient!ww;")
	private final Class394 aClass394_1;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "[Lclient!ku;")
	private final Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ww;Lclient!hq;)V")
	public Class140(@OriginalArg(0) Class394 arg0, @OriginalArg(1) Class153 arg1) {
		this.aClass394_1 = arg0;
		this.anInterface16Array1 = new Interface16[this.aClass394_1.anInterface26Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface16Array1.length; local15++) {
			this.anInterface16Array1[local15] = arg1.method3510(this.aClass394_1.anInterface26Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)I")
	@Override
	public int method7040() {
		@Pc(7) int local7 = 0;
		@Pc(18) Interface16[] local18 = this.anInterface16Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface16 local26 = local18[local20];
			if (local26 == null || local26.method8281()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface16Array1.length;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	@Override
	public void method7042() {
		if (Static119.aClass95_4 != this.aClass95_5) {
			this.aClass95_5 = Static119.aClass95_4;
			this.aBoolean257 = true;
		}
		this.aClass95_5.GA(0);
		@Pc(22) Interface16[] local22 = this.anInterface16Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(36) Interface16 local36 = local22[local24];
			if (local36 != null) {
				local36.method8280();
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
	@Override
	public void method7043() {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7041(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass394_1.anInt10949 <= Static15.method380();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)I")
	@Override
	public int method7038() {
		return this.aClass394_1.anInt10944;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7039(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface16[] local10 = this.anInterface16Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface16 local18 = local10[local12];
			if (local18 != null) {
				local18.method8282();
			}
		}
		this.aBoolean257 = false;
	}
}
