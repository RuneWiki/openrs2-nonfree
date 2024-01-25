import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class273 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Lclient!lg;")
	public Class207 aClass207_4;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	public int anInt7076;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
	public boolean aBoolean531 = false;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!ha;II)Lclient!cw;")
	public Class61 method6026(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2) {
		@Pc(30) long local30 = (long) (this.anInt7076 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt8154 << 19);
		@Pc(38) Class61 local38 = (Class61) this.aClass207_4.aClass32_52.method630(local30);
		if (local38 != null) {
			return local38;
		} else if (this.aClass207_4.aClass380_77.method8638(this.anInt7076)) {
			@Pc(60) Class329 local60 = Static655.method7423(this.aClass207_4.aClass380_77, this.anInt7076, 0);
			if (local60 != null) {
				local60.anInt8811 = local60.anInt8816 = local60.anInt8815 = local60.anInt8814 = 0;
				if (arg0) {
					local60.method7420();
				}
				for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
					local60.method7424();
				}
			}
			local38 = arg1.method6980(local60, true);
			if (local38 != null) {
				this.aClass207_4.aClass32_52.method629(local38, local30);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!vj;II)V")
	private void method6027(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7076 = arg0.method8546();
		} else if (arg1 == 2) {
			this.anInt7068 = arg0.method8539();
		} else if (arg1 == 3) {
			this.aBoolean531 = true;
		} else if (arg1 == 4) {
			this.anInt7076 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method6029(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method6027(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public boolean method6032() {
		return this.aClass207_4.aClass380_77.method8638(this.anInt7076);
	}
}
