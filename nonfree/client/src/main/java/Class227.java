import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class227 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "Lclient!bc;")
	private Class25 aClass25_28;

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
	private int anInt7001;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "Lclient!bc;")
	public Class25 aClass25_29;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "Ljava/lang/String;")
	private String aString75 = "null";

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
	public int method5826(@OriginalArg(1) int arg0) {
		if (this.aClass25_29 == null) {
			return this.anInt7001;
		} else {
			@Pc(25) Class3_Sub48 local25 = (Class3_Sub48) this.aClass25_29.method946((long) arg0);
			return local25 == null ? this.anInt7001 : local25.anInt9989;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method5827(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6538();
			if (local9 == 0) {
				return;
			}
			this.method5829(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method5828(@OriginalArg(0) int arg0) {
		if (this.aClass25_29 == null) {
			return this.aString75;
		} else {
			@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass25_29.method946((long) arg0);
			return local17 == null ? this.aString75 : local17.aString63;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILclient!fd;)V")
	private void method5829(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static142.method2866(arg1.method6529());
		} else if (arg0 == 2) {
			this.aChar4 = Static142.method2866(arg1.method6529());
		} else if (arg0 == 3) {
			this.aString75 = arg1.method6536();
		} else if (arg0 == 4) {
			this.anInt7001 = arg1.method6497();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(31) int local31 = arg1.method6535();
			this.aClass25_29 = new Class25(Static178.method3152(local31));
			for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
				@Pc(46) int local46 = arg1.method6497();
				@Pc(58) Class3 local58;
				if (arg0 == 5) {
					local58 = new Class3_Sub31(arg1.method6536());
				} else {
					local58 = new Class3_Sub48(arg1.method6497());
				}
				this.aClass25_29.method945(local58, (long) local46);
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	private void method5830() {
		this.aClass25_28 = new Class25(this.aClass25_29.method954());
		for (@Pc(18) Class3_Sub31 local18 = (Class3_Sub31) this.aClass25_29.method949(); local18 != null; local18 = (Class3_Sub31) this.aClass25_29.method947()) {
			@Pc(34) Class3_Sub17 local34 = new Class3_Sub17(local18.aString63, (int) local18.aLong262);
			this.aClass25_28.method945(local34, Static361.method5981(local18.aString63));
		}
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(II)Z")
	public boolean method5831(@OriginalArg(0) int arg0) {
		if (this.aClass25_29 == null) {
			return false;
		}
		if (this.aClass25_28 == null) {
			this.method5832();
		}
		@Pc(29) Class3_Sub48 local29 = (Class3_Sub48) this.aClass25_28.method946((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
	private void method5832() {
		this.aClass25_28 = new Class25(this.aClass25_29.method954());
		for (@Pc(18) Class3_Sub48 local18 = (Class3_Sub48) this.aClass25_29.method949(); local18 != null; local18 = (Class3_Sub48) this.aClass25_29.method947()) {
			@Pc(26) Class3_Sub48 local26 = new Class3_Sub48((int) local18.aLong262);
			this.aClass25_28.method945(local26, (long) local18.anInt9989);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5833(@OriginalArg(1) String arg0) {
		if (this.aClass25_29 == null) {
			return false;
		}
		if (this.aClass25_28 == null) {
			this.method5830();
		}
		for (@Pc(23) Class3_Sub17 local23 = (Class3_Sub17) this.aClass25_28.method946(Static361.method5981(arg0)); local23 != null; local23 = (Class3_Sub17) this.aClass25_28.method953()) {
			if (local23.aString41.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
