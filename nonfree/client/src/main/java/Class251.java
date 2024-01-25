import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class251 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!ica;")
	public Class127 aClass127_39;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	private int anInt7808;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "Lclient!ica;")
	private Class127 aClass127_40;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Ljava/lang/String;")
	private String aString156 = "null";

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	private void method6536() {
		this.aClass127_40 = new Class127(this.aClass127_39.method3206());
		for (@Pc(28) Class2_Sub32 local28 = (Class2_Sub32) this.aClass127_39.method3203(); local28 != null; local28 = (Class2_Sub32) this.aClass127_39.method3212()) {
			@Pc(37) Class2_Sub32 local37 = new Class2_Sub32((int) local28.aLong241);
			this.aClass127_40.method3213(local37, (long) local28.anInt5391);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6537(@OriginalArg(0) int arg0) {
		if (this.aClass127_39 == null) {
			return this.aString156;
		} else {
			@Pc(25) Class2_Sub43 local25 = (Class2_Sub43) this.aClass127_39.method3205((long) arg0);
			return local25 == null ? this.aString156 : local25.aString166;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)I")
	public int method6538(@OriginalArg(0) int arg0) {
		if (this.aClass127_39 == null) {
			return this.anInt7808;
		} else {
			@Pc(17) Class2_Sub32 local17 = (Class2_Sub32) this.aClass127_39.method3205((long) arg0);
			return local17 == null ? this.anInt7808 : local17.anInt5391;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method6539(@OriginalArg(0) String arg0) {
		if (this.aClass127_39 == null) {
			return false;
		}
		if (this.aClass127_40 == null) {
			this.method6540();
		}
		for (@Pc(25) Class2_Sub50 local25 = (Class2_Sub50) this.aClass127_40.method3205(Static232.method3632(arg0)); local25 != null; local25 = (Class2_Sub50) this.aClass127_40.method3210()) {
			if (local25.aString213.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	private void method6540() {
		this.aClass127_40 = new Class127(this.aClass127_39.method3206());
		for (@Pc(18) Class2_Sub43 local18 = (Class2_Sub43) this.aClass127_39.method3203(); local18 != null; local18 = (Class2_Sub43) this.aClass127_39.method3212()) {
			@Pc(31) Class2_Sub50 local31 = new Class2_Sub50(local18.aString166, (int) local18.aLong241);
			this.aClass127_40.method3213(local31, Static232.method3632(local18.aString166));
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method6541(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static431.method6618(arg0.method5179());
		} else if (arg1 == 2) {
			this.aChar5 = Static431.method6618(arg0.method5179());
		} else if (arg1 == 3) {
			this.aString156 = arg0.method5194();
		} else if (arg1 == 4) {
			this.anInt7808 = arg0.method5198();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(42) int local42 = arg0.method5229();
			this.aClass127_39 = new Class127(Static131.method2413(local42));
			for (@Pc(52) int local52 = 0; local52 < local42; local52++) {
				@Pc(58) int local58 = arg0.method5198();
				@Pc(70) Class2 local70;
				if (arg1 == 5) {
					local70 = new Class2_Sub43(arg0.method5194());
				} else {
					local70 = new Class2_Sub32(arg0.method5198());
				}
				this.aClass127_39.method3213(local70, (long) local58);
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ps;)V")
	public void method6542(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5170();
			if (local14 == 0) {
				return;
			}
			this.method6541(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)Z")
	public boolean method6544(@OriginalArg(0) int arg0) {
		if (this.aClass127_39 == null) {
			return false;
		}
		if (this.aClass127_40 == null) {
			this.method6536();
		}
		@Pc(22) Class2_Sub32 local22 = (Class2_Sub32) this.aClass127_40.method3205((long) arg0);
		return local22 != null;
	}
}
