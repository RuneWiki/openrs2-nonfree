import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	private int anInt1134;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
	public int anInt1139;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	public int anInt1140;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	public int anInt1143;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
	public int anInt1147;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	private final int anInt1146;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	private final int anInt1141;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	private int anInt1135;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	private int anInt1136;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
	private int anInt1145;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
	public int anInt1137;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!mr;II)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class1_Sub30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub30_5 = arg0;
		this.anInt1146 = arg0.anInt5921;
		this.anInt1141 = arg0.anInt5922;
		this.aBoolean98 = arg0.aBoolean452;
		this.anInt1135 = arg1;
		this.anInt1136 = arg2;
		this.anInt1145 = 8192;
		this.anInt1137 = 0;
		this.method1199();
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!mr;III)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class1_Sub30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub30_5 = arg0;
		this.anInt1146 = arg0.anInt5921;
		this.anInt1141 = arg0.anInt5922;
		this.aBoolean98 = arg0.aBoolean452;
		this.anInt1135 = arg1;
		this.anInt1136 = arg2;
		this.anInt1145 = arg3;
		this.anInt1137 = 0;
		this.method1199();
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	private synchronized void method1178() {
		this.method1197(0, this.method1181());
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
	public synchronized void method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1197(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static546.method1177(arg1, arg2);
		@Pc(14) int local14 = Static546.method1187(arg1, arg2);
		if (this.anInt1147 == local10 && this.anInt1138 == local14) {
			this.anInt1142 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1144;
		if (this.anInt1144 - arg1 > local31) {
			local31 = this.anInt1144 - arg1;
		}
		if (local10 - this.anInt1147 > local31) {
			local31 = local10 - this.anInt1147;
		}
		if (this.anInt1147 - local10 > local31) {
			local31 = this.anInt1147 - local10;
		}
		if (local14 - this.anInt1138 > local31) {
			local31 = local14 - this.anInt1138;
		}
		if (this.anInt1138 - local14 > local31) {
			local31 = this.anInt1138 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1142 = arg0;
		this.anInt1136 = arg1;
		this.anInt1145 = arg2;
		this.anInt1140 = (arg1 - this.anInt1144) / arg0;
		this.anInt1143 = (local10 - this.anInt1147) / arg0;
		this.anInt1139 = (local14 - this.anInt1138) / arg0;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "()I")
	public synchronized int method1181() {
		return this.anInt1145 < 0 ? -1 : this.anInt1145;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([IIIII)I")
	private int method1182(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1142 <= 0) {
				if (this.anInt1135 == -256 && (this.anInt1137 & 0xFF) == 0) {
					if (Static121.aBoolean214) {
						return Static546.method1211(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, arg3, arg2, this);
					}
					return Static546.method1180(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, arg3, arg2, this);
				}
				if (Static121.aBoolean214) {
					return Static546.method1204(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, arg3, arg2, this, this.anInt1135, arg4);
				}
				return Static546.method1212(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, arg3, arg2, this, this.anInt1135, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1142;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1142 += arg1;
			if (this.anInt1135 == -256 && (this.anInt1137 & 0xFF) == 0) {
				if (Static121.aBoolean214) {
					arg1 = Static546.method1214(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, this.anInt1143, this.anInt1139, local5, arg2, this);
				} else {
					arg1 = Static546.method1183(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, this.anInt1140, local5, arg2, this);
				}
			} else if (Static121.aBoolean214) {
				arg1 = Static546.method1186(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, this.anInt1143, this.anInt1139, local5, arg2, this, this.anInt1135, arg4);
			} else {
				arg1 = Static546.method1200(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, this.anInt1140, local5, arg2, this, this.anInt1135, arg4);
			}
			this.anInt1142 -= arg1;
			if (this.anInt1142 != 0) {
				return arg1;
			}
		} while (!this.method1188());
		return arg3;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "()Z")
	public boolean method1184() {
		return this.anInt1137 < 0 || this.anInt1137 >= ((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77.length << 8;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
	public synchronized void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1179(arg0, arg1, this.method1181());
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "()Z")
	private boolean method1188() {
		@Pc(2) int local2 = this.anInt1136;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static546.method1177(local2, this.anInt1145);
			local8 = Static546.method1187(local2, this.anInt1145);
		}
		if (this.anInt1144 != local2 || this.anInt1147 != local10 || this.anInt1138 != local8) {
			if (this.anInt1144 < local2) {
				this.anInt1140 = 1;
				this.anInt1142 = local2 - this.anInt1144;
			} else if (this.anInt1144 > local2) {
				this.anInt1140 = -1;
				this.anInt1142 = this.anInt1144 - local2;
			} else {
				this.anInt1140 = 0;
			}
			if (this.anInt1147 < local10) {
				this.anInt1143 = 1;
				if (this.anInt1142 == 0 || this.anInt1142 > local10 - this.anInt1147) {
					this.anInt1142 = local10 - this.anInt1147;
				}
			} else if (this.anInt1147 > local10) {
				this.anInt1143 = -1;
				if (this.anInt1142 == 0 || this.anInt1142 > this.anInt1147 - local10) {
					this.anInt1142 = this.anInt1147 - local10;
				}
			} else {
				this.anInt1143 = 0;
			}
			if (this.anInt1138 < local8) {
				this.anInt1139 = 1;
				if (this.anInt1142 == 0 || this.anInt1142 > local8 - this.anInt1138) {
					this.anInt1142 = local8 - this.anInt1138;
				}
			} else if (this.anInt1138 > local8) {
				this.anInt1139 = -1;
				if (this.anInt1142 == 0 || this.anInt1142 > this.anInt1138 - local8) {
					this.anInt1142 = this.anInt1138 - local8;
				}
			} else {
				this.anInt1139 = 0;
			}
			return false;
		} else if (this.anInt1136 == Integer.MIN_VALUE) {
			this.anInt1136 = 0;
			this.anInt1144 = this.anInt1147 = this.anInt1138 = 0;
			this.method8239();
			return true;
		} else {
			this.method1199();
			return false;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public synchronized void method1191(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1178();
			this.method8239();
		} else if (this.anInt1147 == 0 && this.anInt1138 == 0) {
			this.anInt1142 = 0;
			this.anInt1136 = 0;
			this.anInt1144 = 0;
			this.method8239();
		} else {
			@Pc(31) int local31 = -this.anInt1144;
			if (this.anInt1144 > local31) {
				local31 = this.anInt1144;
			}
			if (-this.anInt1147 > local31) {
				local31 = -this.anInt1147;
			}
			if (this.anInt1147 > local31) {
				local31 = this.anInt1147;
			}
			if (-this.anInt1138 > local31) {
				local31 = -this.anInt1138;
			}
			if (this.anInt1138 > local31) {
				local31 = this.anInt1138;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1142 = arg0;
			this.anInt1136 = Integer.MIN_VALUE;
			this.anInt1140 = -this.anInt1144 / arg0;
			this.anInt1143 = -this.anInt1147 / arg0;
			this.anInt1139 = -this.anInt1138 / arg0;
		}
	}

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "()V")
	private void method1192() {
		if (this.anInt1142 == 0) {
			return;
		}
		if (this.anInt1136 == Integer.MIN_VALUE) {
			this.anInt1136 = 0;
		}
		this.anInt1142 = 0;
		this.method1199();
	}

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "()Z")
	public boolean method1195() {
		return this.anInt1142 != 0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7984() {
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(II)V")
	private synchronized void method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1136 = arg0;
		this.anInt1145 = arg1;
		this.anInt1142 = 0;
		this.method1199();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7981(@OriginalArg(0) int arg0) {
		if (this.anInt1142 > 0) {
			if (arg0 >= this.anInt1142) {
				if (this.anInt1136 == Integer.MIN_VALUE) {
					this.anInt1136 = 0;
					this.anInt1144 = this.anInt1147 = this.anInt1138 = 0;
					this.method8239();
					arg0 = this.anInt1142;
				}
				this.anInt1142 = 0;
				this.method1199();
			} else {
				this.anInt1144 += this.anInt1140 * arg0;
				this.anInt1147 += this.anInt1143 * arg0;
				this.anInt1138 += this.anInt1139 * arg0;
				this.anInt1142 -= arg0;
			}
		}
		@Pc(71) Class1_Sub30_Sub1 local71 = (Class1_Sub30_Sub1) super.aClass1_Sub30_5;
		@Pc(76) int local76 = this.anInt1146 << 8;
		@Pc(81) int local81 = this.anInt1141 << 8;
		@Pc(87) int local87 = local71.aByteArray77.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1134 = 0;
		}
		if (this.anInt1137 < 0) {
			if (this.anInt1135 <= 0) {
				this.method1192();
				this.method8239();
				return;
			}
			this.anInt1137 = 0;
		}
		if (this.anInt1137 >= local87) {
			if (this.anInt1135 >= 0) {
				this.method1192();
				this.method8239();
				return;
			}
			this.anInt1137 = local87 - 1;
		}
		this.anInt1137 += this.anInt1135 * arg0;
		if (this.anInt1134 >= 0) {
			if (this.anInt1134 > 0) {
				if (this.aBoolean98) {
					label125: {
						if (this.anInt1135 < 0) {
							if (this.anInt1137 >= local76) {
								return;
							}
							this.anInt1137 = local76 + local76 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
							if (--this.anInt1134 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1137 < local81) {
								return;
							}
							this.anInt1137 = local81 + local81 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
							if (--this.anInt1134 == 0) {
								break;
							}
							if (this.anInt1137 >= local76) {
								return;
							}
							this.anInt1137 = local76 + local76 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
						} while (--this.anInt1134 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1135 < 0) {
						if (this.anInt1137 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1137 - 1) / local91;
						if (local361 < this.anInt1134) {
							this.anInt1137 += local91 * local361;
							this.anInt1134 -= local361;
							return;
						}
						this.anInt1137 += local91 * this.anInt1134;
						this.anInt1134 = 0;
					} else if (this.anInt1137 >= local81) {
						local361 = (this.anInt1137 - local76) / local91;
						if (local361 < this.anInt1134) {
							this.anInt1137 -= local91 * local361;
							this.anInt1134 -= local361;
							return;
						}
						this.anInt1137 -= local91 * this.anInt1134;
						this.anInt1134 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1135 < 0) {
				if (this.anInt1137 < 0) {
					this.anInt1137 = -1;
					this.method1192();
					this.method8239();
					return;
				}
			} else if (this.anInt1137 >= local87) {
				this.anInt1137 = local87;
				this.method1192();
				this.method8239();
			}
		} else if (this.aBoolean98) {
			if (this.anInt1135 < 0) {
				if (this.anInt1137 >= local76) {
					return;
				}
				this.anInt1137 = local76 + local76 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
			}
			while (this.anInt1137 >= local81) {
				this.anInt1137 = local81 + local81 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
				if (this.anInt1137 >= local76) {
					return;
				}
				this.anInt1137 = local76 + local76 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
			}
		} else if (this.anInt1135 < 0) {
			if (this.anInt1137 < local76) {
				this.anInt1137 = local81 - (local81 - 1 - this.anInt1137) % local91 - 1;
			}
		} else if (this.anInt1137 >= local81) {
			this.anInt1137 = local76 + (this.anInt1137 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "()V")
	private void method1199() {
		this.anInt1144 = this.anInt1136;
		this.anInt1147 = Static546.method1177(this.anInt1136, this.anInt1145);
		this.anInt1138 = Static546.method1187(this.anInt1136, this.anInt1145);
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)V")
	public synchronized void method1201(@OriginalArg(0) int arg0) {
		this.anInt1134 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "([IIIII)I")
	private int method1202(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1142 <= 0) {
				if (this.anInt1135 == 256 && (this.anInt1137 & 0xFF) == 0) {
					if (Static121.aBoolean214) {
						return Static546.method1176(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, arg3, arg2, this);
					}
					return Static546.method1189(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, arg3, arg2, this);
				}
				if (Static121.aBoolean214) {
					return Static546.method1190(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, arg3, arg2, this, this.anInt1135, arg4);
				}
				return Static546.method1203(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, arg3, arg2, this, this.anInt1135, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1142;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1142 += arg1;
			if (this.anInt1135 == 256 && (this.anInt1137 & 0xFF) == 0) {
				if (Static121.aBoolean214) {
					arg1 = Static546.method1210(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, this.anInt1143, this.anInt1139, local5, arg2, this);
				} else {
					arg1 = Static546.method1194(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, this.anInt1140, local5, arg2, this);
				}
			} else if (Static121.aBoolean214) {
				arg1 = Static546.method1198(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1147, this.anInt1138, this.anInt1143, this.anInt1139, local5, arg2, this, this.anInt1135, arg4);
			} else {
				arg1 = Static546.method1193(((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77, arg0, this.anInt1137, arg1, this.anInt1144, this.anInt1140, local5, arg2, this, this.anInt1135, arg4);
			}
			this.anInt1142 -= arg1;
			if (this.anInt1142 != 0) {
				return arg1;
			}
		} while (!this.method1188());
		return arg3;
	}

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "()I")
	public synchronized int method1205() {
		return this.anInt1135 < 0 ? -this.anInt1135 : this.anInt1135;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	public synchronized void method1206() {
		this.anInt1135 = (this.anInt1135 ^ this.anInt1135 >> 31) + (this.anInt1135 >>> 31);
		this.anInt1135 = -this.anInt1135;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "()I")
	@Override
	public int method7987() {
		return this.anInt1136 == 0 && this.anInt1142 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V")
	public synchronized void method1208(@OriginalArg(0) int arg0) {
		this.method1197(arg0 << 6, this.method1181());
	}

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "(I)V")
	public synchronized void method1209(@OriginalArg(0) int arg0) {
		if (this.anInt1135 < 0) {
			this.anInt1135 = -arg0;
		} else {
			this.anInt1135 = arg0;
		}
	}

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "()I")
	public synchronized int method1213() {
		return this.anInt1136 == Integer.MIN_VALUE ? 0 : this.anInt1136;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1136 == 0 && this.anInt1142 == 0) {
			this.method7981(arg2);
			return;
		}
		@Pc(13) Class1_Sub30_Sub1 local13 = (Class1_Sub30_Sub1) super.aClass1_Sub30_5;
		@Pc(18) int local18 = this.anInt1146 << 8;
		@Pc(23) int local23 = this.anInt1141 << 8;
		@Pc(29) int local29 = local13.aByteArray77.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1134 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1137 < 0) {
			if (this.anInt1135 <= 0) {
				this.method1192();
				this.method8239();
				return;
			}
			this.anInt1137 = 0;
		}
		if (this.anInt1137 >= local29) {
			if (this.anInt1135 >= 0) {
				this.method1192();
				this.method8239();
				return;
			}
			this.anInt1137 = local29 - 1;
		}
		if (this.anInt1134 >= 0) {
			if (this.anInt1134 > 0) {
				if (this.aBoolean98) {
					label130: {
						if (this.anInt1135 < 0) {
							local40 = this.method1182(arg0, arg1, local18, local44, local13.aByteArray77[this.anInt1146]);
							if (this.anInt1137 >= local18) {
								return;
							}
							this.anInt1137 = local18 + local18 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
							if (--this.anInt1134 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1202(arg0, local40, local23, local44, local13.aByteArray77[this.anInt1141 - 1]);
							if (this.anInt1137 < local23) {
								return;
							}
							this.anInt1137 = local23 + local23 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
							if (--this.anInt1134 == 0) {
								break;
							}
							local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray77[this.anInt1146]);
							if (this.anInt1137 >= local18) {
								return;
							}
							this.anInt1137 = local18 + local18 - this.anInt1137 - 1;
							this.anInt1135 = -this.anInt1135;
						} while (--this.anInt1134 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1135 < 0) {
						while (true) {
							local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray77[this.anInt1141 - 1]);
							if (this.anInt1137 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1137 - 1) / local33;
							if (local416 >= this.anInt1134) {
								this.anInt1137 += local33 * this.anInt1134;
								this.anInt1134 = 0;
								break;
							}
							this.anInt1137 += local33 * local416;
							this.anInt1134 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1202(arg0, local40, local23, local44, local13.aByteArray77[this.anInt1146]);
							if (this.anInt1137 < local23) {
								return;
							}
							local416 = (this.anInt1137 - local18) / local33;
							if (local416 >= this.anInt1134) {
								this.anInt1137 -= local33 * this.anInt1134;
								this.anInt1134 = 0;
								break;
							}
							this.anInt1137 -= local33 * local416;
							this.anInt1134 -= local416;
						}
					}
				}
			}
			if (this.anInt1135 < 0) {
				this.method1182(arg0, local40, 0, local44, 0);
				if (this.anInt1137 < 0) {
					this.anInt1137 = -1;
					this.method1192();
					this.method8239();
					return;
				}
			} else {
				this.method1202(arg0, local40, local29, local44, 0);
				if (this.anInt1137 >= local29) {
					this.anInt1137 = local29;
					this.method1192();
					this.method8239();
				}
			}
		} else if (this.aBoolean98) {
			if (this.anInt1135 < 0) {
				local40 = this.method1182(arg0, arg1, local18, local44, local13.aByteArray77[this.anInt1146]);
				if (this.anInt1137 >= local18) {
					return;
				}
				this.anInt1137 = local18 + local18 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
			}
			while (true) {
				local40 = this.method1202(arg0, local40, local23, local44, local13.aByteArray77[this.anInt1141 - 1]);
				if (this.anInt1137 < local23) {
					return;
				}
				this.anInt1137 = local23 + local23 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
				local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray77[this.anInt1146]);
				if (this.anInt1137 >= local18) {
					return;
				}
				this.anInt1137 = local18 + local18 - this.anInt1137 - 1;
				this.anInt1135 = -this.anInt1135;
			}
		} else if (this.anInt1135 < 0) {
			while (true) {
				local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray77[this.anInt1141 - 1]);
				if (this.anInt1137 >= local18) {
					return;
				}
				this.anInt1137 = local23 - (local23 - 1 - this.anInt1137) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1202(arg0, local40, local23, local44, local13.aByteArray77[this.anInt1146]);
				if (this.anInt1137 < local23) {
					return;
				}
				this.anInt1137 = local18 + (this.anInt1137 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()I")
	@Override
	public int method7985() {
		@Pc(6) int local6 = this.anInt1144 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1134 == 0) {
			local6 -= local6 * this.anInt1137 / (((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77.length << 8);
		} else if (this.anInt1134 >= 0) {
			local6 -= local6 * this.anInt1146 / ((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7983() {
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "(I)V")
	public synchronized void method1215(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub30_Sub1) super.aClass1_Sub30_5).aByteArray77.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1137 = arg0;
	}
}
