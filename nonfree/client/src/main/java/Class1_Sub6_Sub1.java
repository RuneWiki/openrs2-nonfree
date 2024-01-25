import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "[Lclient!df;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!bba", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
	private final int anInt418;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0) {
		this.anInt418 = arg0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)Z")
	public boolean method346(@OriginalArg(0) int arg0) {
		return this.aClass69Array1[arg0].aBoolean140;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)Z")
	public boolean method348(@OriginalArg(1) int arg0) {
		return this.aClass69Array1[arg0].aBoolean138;
	}

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)Z")
	public boolean method351() {
		if (this.aClass69Array1 != null) {
			return true;
		}
		@Pc(40) int[] local40;
		@Pc(47) int local47;
		if (this.aByteArrayArray2 == null) {
			@Pc(20) Class270 local20 = Static301.aClass270_59;
			synchronized (Static301.aClass270_59) {
				if (!Static301.aClass270_59.method5679(this.anInt418)) {
					return false;
				}
				local40 = Static301.aClass270_59.method5699(this.anInt418);
				this.aByteArrayArray2 = new byte[local40.length][];
				for (local47 = 0; local47 < local40.length; local47++) {
					this.aByteArrayArray2[local47] = Static301.aClass270_59.method5704(this.anInt418, local40[local47]);
				}
			}
		}
		@Pc(74) boolean local74 = true;
		for (@Pc(76) int local76 = 0; local76 < this.aByteArrayArray2.length; local76++) {
			@Pc(83) byte[] local83 = this.aByteArrayArray2[local76];
			@Pc(88) Class1_Sub35 local88 = new Class1_Sub35(local83);
			local88.anInt7214 = 1;
			local47 = local88.method5771();
			@Pc(97) Class270 local97 = Static218.aClass270_46;
			synchronized (Static218.aClass270_46) {
				local74 &= Static218.aClass270_46.method5694(local47);
			}
		}
		if (!local74) {
			return false;
		}
		@Pc(130) Class353 local130 = new Class353();
		@Pc(132) Class270 local132 = Static301.aClass270_59;
		synchronized (Static301.aClass270_59) {
			@Pc(140) int local140 = Static301.aClass270_59.method5685(this.anInt418);
			this.aClass69Array1 = new Class69[local140];
			local40 = Static301.aClass270_59.method5699(this.anInt418);
		}
		for (local47 = 0; local47 < local40.length; local47++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray2[local47];
			@Pc(170) Class1_Sub35 local170 = new Class1_Sub35(local165);
			local170.anInt7214 = 1;
			@Pc(177) int local177 = local170.method5771();
			@Pc(179) Class1_Sub36 local179 = null;
			for (@Pc(184) Class1_Sub36 local184 = (Class1_Sub36) local130.method7677(); local184 != null; local184 = (Class1_Sub36) local130.method7687()) {
				if (local177 == local184.anInt5703) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(204) Class270 local204 = Static218.aClass270_46;
				synchronized (Static218.aClass270_46) {
					local179 = new Class1_Sub36(local177, Static218.aClass270_46.method5691(local177));
				}
				local130.method7679(local179);
			}
			this.aClass69Array1[local40[local47]] = new Class69(local165, local179);
		}
		this.aByteArrayArray2 = null;
		return true;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Z")
	public boolean method353(@OriginalArg(1) int arg0) {
		return this.aClass69Array1[arg0].aBoolean139;
	}
}
